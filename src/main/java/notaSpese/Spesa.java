package notaSpese;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Spese")

public class Spesa {
	
	// Campi della tabella Spese
	
	private int ID;
	
	@OneToMany
	@JoinColumn(name="ID", table="Trasferta")
	private int ID_TrasfertaCollegata;
	
	private String DataSpesa;
	private String Descrizione;
	private float Importo;
	
	
	// Getters and setters
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getID_TrasfertaCollegata() {
		return ID_TrasfertaCollegata;
	}
	public void setID_TrasfertaCollegata(int iD_TrasfertaCollegata) {
		ID_TrasfertaCollegata = iD_TrasfertaCollegata;
	}
	public String getDataSpesa() {
		return DataSpesa;
	}
	public void setDataSpesa(String dataSpesa) {
		DataSpesa = dataSpesa;
	}
	public String getDescrizione() {
		return Descrizione;
	}
	public void setDescrizione(String descrizione) {
		Descrizione = descrizione;
	}
	public float getImporto() {
		return Importo;
	}
	public void setImporto(float importo) {
		Importo = importo;
	}
	
}
