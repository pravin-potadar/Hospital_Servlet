package com.nt;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HrShowAllServlet extends HttpServlet {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		Dao d = new Dao();

		List<DrShow> l = d.DrList();

		System.out.println(l);

		req.setAttribute("Drtlist", l);
		RequestDispatcher rd = req.getRequestDispatcher("HrShow.jsp");
		rd.forward(req, res);

	}
}

//}
