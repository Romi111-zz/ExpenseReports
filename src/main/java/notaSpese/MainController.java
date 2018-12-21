package notaSpese;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import notaSpese.Trasferta;
import notaSpese.TrasferteRepository;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/expensesmanagement") // This means URL's start with /demo (after Application path)
public class MainController {
	@Autowired // This means to get the bean called TrasferteRepository
	           // Which is auto-generated by Spring, we will use it to handle the data
	private TrasferteRepository TrasferteRepository;

	@GetMapping(path="/nuovatrasferta") // Map ONLY GET Requests
	public @ResponseBody String addNewTrasferta (@RequestParam String Nome
			, @RequestParam String DataInizio
			, @RequestParam String DataFine
			) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		Trasferta t = new Trasferta();
		t.setNome(Nome);
		t.setDataInizio(DataInizio);
		t.setDataFine(DataFine);
		TrasferteRepository.save(t);
		return "Saved";
	}
	
	@Autowired // This means to get the bean called SpeseRepository
    		   // Which is auto-generated by Spring, we will use it to handle the data
	private SpeseRepository SpeseRepository;

	@GetMapping(path="/nuovaspesa") // Map ONLY GET Requests
	public @ResponseBody String addNewSpesa (@RequestParam int ID_TrasfertaCollegata
			, @RequestParam String DataSpesa
			, @RequestParam String Descrizione
			, @RequestParam float Importo
			) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		Spesa s = new Spesa();
		s.setID_TrasfertaCollegata(ID_TrasfertaCollegata);
		s.setDataSpesa(DataSpesa);
		s.setDescrizione(Descrizione);
		s.setImporto(Importo);
		SpeseRepository.save(s);
		return "Saved";
	}

	@GetMapping(path="/getlistatrasferte")
	public @ResponseBody Iterable<Trasferta> getAllTrasferte() {
		// This returns a JSON or XML with the Trasferte
		return TrasferteRepository.findAll();
	}
	
	@GetMapping(path="/getlistaspese")
	public @ResponseBody Iterable<Spesa> getAllSpese() {
		// This returns a JSON or XML with the Spese
		return SpeseRepository.findAll();
	}
}
