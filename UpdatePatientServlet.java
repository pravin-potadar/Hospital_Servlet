package com.nt;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdatePatientServlet extends HttpServlet {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		int contact = Integer.parseInt(req.getParameter("contact"));
		String address = req.getParameter("address");
		String gender = req.getParameter("gender");
		int age = Integer.parseInt(req.getParameter("age"));
		String allergy = req.getParameter("allergy");

		Dao d = new Dao();

		boolean data = d.UpdatePatient(id, name, contact, address, gender, age, allergy);

		if (data == true) {

			req.setAttribute("msg", "Data to be update");
			RequestDispatcher rd = req.getRequestDispatcher("DrUpdate.jsp");
			rd.forward(req, res);
		} else {
			req.setAttribute("msg", "Not Data to be update");
			RequestDispatcher rd = req.getRequestDispatcher("DrUpdate.jsp");
			rd.forward(req, res);
		}

		System.out.println(data);

	}

}
