package it.uniroma3.siw.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.uniroma3.siw.controller.validator.PersonaValidator;
import it.uniroma3.siw.model.Persona;

@WebServlet("/index")
public class IndexController extends HttpServlet{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();

		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String nextPage;
		
		Persona persona = new Persona();
		persona.setNome(nome);
		persona.setCognome(cognome);
		
		session.setAttribute("persona", persona);
		
		if (new PersonaValidator().valid(request)) {
			nextPage = "/conferma.jsp";
		}
		else {
			request.setAttribute("persona", persona);
			nextPage = "/index.jsp";
		}
		
		// inoltro
		ServletContext application  = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(nextPage);
		rd.forward(request, response);
		return;
	}
}
