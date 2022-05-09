package it.uniroma3.siw.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import it.uniroma3.siw.model.Persona;

public class PersonaService {
	
	public void save(Persona persona) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persona");
		EntityManager em = emf.createEntityManager();
		em.persist(persona);
		em.close();
		emf.close();
	}
}
