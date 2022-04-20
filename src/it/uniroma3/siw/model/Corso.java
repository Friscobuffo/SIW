package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Corso {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private LocalDate dataInizio;
	private Integer durataMesi;
	
	@ManyToOne
	@Column(nullable = false)
	private Docente docente;
	
	@ManyToMany(mappedBy = "corsi")
	private List<Allievo> allievi;
}
