package com.nt;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String role = req.getParameter("role");
	
//		Cookie c1 = new Cookie("User",name);
//		Cookie c2 = new Cookie("Pass", password);
//		
			
		
		
		
		Dao d = new Dao();
		boolean valid = d.LoginConform(name, password);
		if(valid) {
			if(role.equals("HR")){
				System.out.println("welcome  HR");
				RequestDispatcher rd = req.getRequestDispatcher("HrAdd.jsp");
				rd.forward( req, res );
				
			}else if(role.equals("DR")) {
				System.out.println("welcome  DR");
				RequestDispatcher rd = req.getRequestDispatcher("DRdata.jsp");
				rd.forward(req, res);
			}
			else {
				RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
				rd.forward(req, res);
			}
		}
		else {
			System.out.println("not validz");
		}
	}	
	
}
		
		
		        
		        
		        

		
