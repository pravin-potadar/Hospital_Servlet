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

public class ShowAllServlet extends HttpServlet {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service( HttpServletRequest req, HttpServletResponse res ) throws ServletException, IOException {
//		System.out.println("1ffvk,");
//	try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3301/hospitaldata", "root", "root");
//		
//		
//		PreparedStatement ps = con.prepareStatement( "select * from doctor" );
//		ResultSet rs = ps.executeQuery();
//		
//		List<SelectAll> list = new ArrayList<>();
//		
//		while ( rs.next() ) {
//			//record
//			int id = rs.getInt( "id" );
//			String name = rs.getString( "name" );
//			int contact = rs.getInt( "contact" );
//			String address = rs.getString( "address" );
//			String gender = rs.getString( "gender" );
//			int age = rs.getInt( "age" );
//			String allergy = rs.getString( "allergy" );
//			
//			SelectAll s = new SelectAll(id,name,contact,address,gender,age,allergy);
//			list.add( s );
//		}
//		System.out.println("12345"+list);
//		req.setAttribute( "patientlist", list );
//		RequestDispatcher rd = req.getRequestDispatcher( "DrShow.jsp" );
//		rd.forward( req, res );
//
//	} catch ( Exception ex ) {
//		ex.printStackTrace();
//	}
//	
		
		
		Dao d = new Dao();

		List<SelectAll> l = (List<SelectAll>) d.Plist();

		System.out.println(l);
		
		req.setAttribute( "patientlist", l );
		RequestDispatcher rd = req.getRequestDispatcher( "DrShow.jsp" );
		rd.forward( req, res );

		
		
 }
}
