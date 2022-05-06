package it.uniroma3.siw.controller.validator;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class PersonaValidator {

	public boolean valid(HttpServletRequest request) {
		
		boolean isValid = true;
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		
		Map<String, String> messaggiErrore = new HashMap<>();
		if (nome.isBlank()) {
			messaggiErrore.put("nome", "inserire un nome");
			isValid = false;
		}
		if (cognome.isBlank()) {
			messaggiErrore.put("cognome", "inserire un cognome");
			isValid = false;
		}
		request.setAttribute("messaggiErrore", messaggiErrore);
		return isValid;
	}
}
