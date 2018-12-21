package notaSpese;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	// Campi della tabella Spese
	
	private int ID_TrasfertaCollegata;
	private String DataSpesa;
	private String Descrizione;
	private float Importo;
	
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
	
	// Attraverso @Column(table="Spese") indichiamo che getters e setters appartengono alla tabella Spese
	

	
	@Column(table="Spese")
	public String getDataSpesa() {
		return DataSpesa;
	}
	public void setDataSpesa(String dataSpesa) {
		DataSpesa = dataSpesa;
	}
	
	@Column(table="Spese")
	public int getID_TrasfertaCollegata() {
		return ID_TrasfertaCollegata;
	}
	public void setID_TrasfertaCollegata(int iD_TrasfertaCollegata) {
		ID_TrasfertaCollegata = iD_TrasfertaCollegata;
	}
	
	@Column(table="Spese")
	public String getDescrizione() {
		return Descrizione;
	}
	public void setDescrizione(String descrizione) {
		Descrizione = descrizione;
	}
	@Column(table="Spese")
	public float getImporto() {
		return Importo;
	}
	public void setImporto(float importo) {
		Importo = importo;
	}
	
}
