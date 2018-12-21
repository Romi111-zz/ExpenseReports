package notaSpese;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.SecondaryTable;

@Entity
@Table(name="Trasferte")
@SecondaryTable(name="Spese")

public class Trasferta {
	
	// Campi della tabella Trasferte
	
	private int ID;
	private String Nome;
	private String DataInizio;
	private String DataFine;
	
	// Getters and Setters
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getDataInizio() {
		return DataInizio;
	}
	public void setDataInizio(String dataInizio) {
		DataInizio = dataInizio;
	}
	public String getDataFine() {
		return DataFine;
	}
	public void setDataFine(String dataFine) {
		DataFine = dataFine;
	}
	
}
