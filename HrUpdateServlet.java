package com.nt;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HrUpdateServlet extends HttpServlet  {
	
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		int contact = Integer.parseInt(req.getParameter("contact"));
		int experience = Integer.parseInt(req.getParameter("experience"));
		String degree = req.getParameter("degree");
		String speciality = req.getParameter("speciality");
		int fee = Integer.parseInt(req.getParameter("fee"));
		
		

		Dao d = new Dao();

		boolean data = d.UpdateDoctor(id, name, contact, experience, degree, speciality, fee);

		if (data == true) {

			req.setAttribute("msg", "Data to be update");
			RequestDispatcher rd = req.getRequestDispatcher("HrUpdate.jsp");
			rd.forward(req, res);
		} else {
			req.setAttribute("msg", "Not Data to be update");
			RequestDispatcher rd = req.getRequestDispatcher("HrUpdate.jsp");
			rd.forward(req, res);
		}

		System.out.println(data);
	}
}
