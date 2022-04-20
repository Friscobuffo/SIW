package it.uniroma3.siw.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Societa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length = 2000)
	private String ragioneSociale;
	
	@Column(nullable = false)
	private String indirizzoVIa;
	@Column(nullable = false)
	private Integer numeroCivico;
	@Column(nullable = false)
	private Integer cap;
	@Column(nullable = false)
	private String provincia;
	@Column(nullable = false)
	private String comune;
	
	@Column(nullable = false)
	private String numeroTelefono;
	
	
}
