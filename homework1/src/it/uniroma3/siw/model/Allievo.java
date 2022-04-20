package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Allievo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(unique = true, nullable = false)
	private Long numeroMatricola;
	
	private String nome;
	private String cognome;
	
	
	private String email;
	
	private LocalDate dataDiNascita;
	private String luogoDiNascita;
	
	@OneToOne(cascade = {CascadeType.PERSIST})
	@Column(nullable = false)
	private Societa societaDiConsulenza;
	
	//fetch; è utile conoscere subito tutti i corsi alla quale si è iscritti
	@ManyToMany(fetch = FetchType.EAGER)
	@Column(nullable = false)
	private List<Corso> corsi;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumeroMatricola() {
		return numeroMatricola;
	}

	public void setNumeroMatricola(Long numeroMatricola) {
		this.numeroMatricola = numeroMatricola;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(LocalDate dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public String getLuogoDiNascita() {
		return luogoDiNascita;
	}

	public void setLuogoDiNascita(String luogoDiNascita) {
		this.luogoDiNascita = luogoDiNascita;
	}

	public Societa getSocietaDiConsulenza() {
		return societaDiConsulenza;
	}

	public void setSocietaDiConsulenza(Societa societaDiConsulenza) {
		this.societaDiConsulenza = societaDiConsulenza;
	}

	public List<Corso> getCorsi() {
		return corsi;
	}

	public void setCorsi(List<Corso> corsi) {
		this.corsi = corsi;
	}
}
