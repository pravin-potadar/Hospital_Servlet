package com.nt;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeletePatientServlet extends HttpServlet {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		

		Dao d = new Dao();

		boolean data = d.DeletePatient(id);

		if (data == true) {

			req.setAttribute("msg", "Data to be delete");
			RequestDispatcher rd = req.getRequestDispatcher("DrDelete.jsp");
			rd.forward(req, res);
		} else {
			req.setAttribute("msg", "Not Data to be delete");
			RequestDispatcher rd = req.getRequestDispatcher("DrDelete.jsp");
			rd.forward(req, res);
		}

		System.out.println(data);
	}
	
}

