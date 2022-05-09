package it.uniroma3.siw.controller.validator;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import it.uniroma3.siw.model.Persona;

public class PersonaValidator {

	public boolean valid(HttpServletRequest request) {
		
		boolean isValid = true;
		HttpSession session = request.getSession();
		Persona persona = (Persona) session.getAttribute("persona");
		
		Map<String, String> messaggiErrore = new HashMap<>();
		if (persona.getNome().isBlank()) {
			messaggiErrore.put("nome", "inserire un nome");
			isValid = false;
		}
		if (persona.getCognome().isBlank()) {
			messaggiErrore.put("cognome", "inserire un cognome");
			isValid = false;
		}
		request.setAttribute("messaggiErrore", messaggiErrore);
		return isValid;
	}
}
