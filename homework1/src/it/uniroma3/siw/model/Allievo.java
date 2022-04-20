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
	
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String cognome;
	
	@Column(nullable = false)
	private LocalDate dataDiNascita;
	@Column(nullable = false)
	private String luogoDiNascita;
	
	@OneToOne(cascade = {CascadeType.PERSIST})
	@Column(nullable = false)
	private Societa societaDiConsulenza;
	
	//fetch; è utile conoscere subito tutti i corsi alla quale si è iscritti
	@ManyToMany(fetch = FetchType.EAGER)
	@Column(nullable = false)
	private List<Corso> corsi;
}
