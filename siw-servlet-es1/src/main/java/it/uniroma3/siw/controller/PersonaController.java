package it.uniroma3.siw.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.uniroma3.siw.controller.validator.PersonaValidator;
import it.uniroma3.siw.model.Persona;
import it.uniroma3.siw.service.PersonaService;

@WebServlet("/persona")
public class PersonaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// gestione della RICHIESTA

		// leggo i parametri, li porto in maiuscolo e li salvo in varibaili locali
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String nextPage;
		// gestione della RISPOSTA
		
		if (new PersonaValidator().valid(request)) {
			Persona persona = new Persona();
			persona.setNome(nome);
			persona.setCognome(cognome);
			
			PersonaService service = new PersonaService();
			service.save(persona);
			
			nextPage = "/persona.jsp";
		}
		else {
			nextPage = "/index.jsp";
		}
		request.setAttribute("nome", nome.toUpperCase());
		request.setAttribute("cognome", cognome.toUpperCase());
		// inoltro
		ServletContext application  = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(nextPage);
		rd.forward(request, response);
		return; 

	}
}
