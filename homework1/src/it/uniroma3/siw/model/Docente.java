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
import javax.persistence.OneToMany;

@Entity
public class Docente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String cognome;
	
	@Column(nullable = false)
	private String luogoDiNascita;
	@Column(nullable = false)
	private LocalDate dataDiNascita;
	
	@Column(nullable = false)
	private String numeroPartitaIva;
	
	//cascade: la rimozione del professore comporta la rimozione anche dei suoi corsi
	//fetch: è utile conoscere subito tutti i corsi sostenuti dal professore
	@OneToMany(mappedBy = "docente", cascade = {CascadeType.REMOVE}, fetch = FetchType.EAGER)
	private List<Corso> corsi;
}
