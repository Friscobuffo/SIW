package it.uniroma3.siw.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Societa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length = 2000)
	private String ragioneSociale;
	
	@OneToOne
	private Indirizzo indirizzo;
	
	private String numeroTelefono;

	public Societa() {}
	
	public Societa(String ragioneSociale, Indirizzo indirizzo, String numeroTelefono) {
		this.ragioneSociale = ragioneSociale;
		this.indirizzo = indirizzo;
		this.numeroTelefono = numeroTelefono;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}
	
	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}
	
	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}	
}
