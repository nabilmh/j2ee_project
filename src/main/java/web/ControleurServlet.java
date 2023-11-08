package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Clientdao;
import dao.ClientdaoImpl;
import entities.Client;
@WebServlet(name="cs",urlPatterns= {"*.php"})
public class ControleurServlet extends HttpServlet{
private Clientdao metier;
	
	@Override
	public void init() throws ServletException {
		// Cette methode s'execute lors du chargement de la Servlet en memoire
		metier= new ClientdaoImpl();
		
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getServletPath();
		if(path.equals("/saisie.php")) {
			req.getRequestDispatcher("client.jsp").forward(req, resp);
		}
		else if(path.equals("/saveclient.php")&&(req.getMethod().equals("POST"))) {
			String nom1 = req.getParameter("nom");
			String prenom1 = req.getParameter("prenom");
			String adds = req.getParameter("address");
			Client c = metier.save(new Client(nom1,prenom1,adds));
			req.setAttribute("clients", c);
			req.getRequestDispatcher("confirmation.jsp").forward(req, resp);
		}
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, 
			HttpServletResponse resp) 
					throws ServletException, IOException{
		
		doGet(req,resp);
		
	}

}
