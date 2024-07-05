package com.nt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

public class Dao {
	static Connection con;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3301/hospitaldata", "root", "root");

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public boolean AddPatient(int id, String name, int contact, String address, String gender, int age,
			String allergy) {

		try {

			System.out.println("insert data");

			PreparedStatement ps = con.prepareStatement("INSERT INTO patient VALUES(?,?,?,?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, contact);
			ps.setString(4, address);
			ps.setString(5, gender);
			ps.setInt(6, age);
			ps.setString(7, allergy);

			int result = ps.executeUpdate();
			if (result == 1)
				return true;

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("not insert data");
		}
		return false;

	}

	public boolean UpdatePatient(int id, String name, int contact, String address, String gender, int age,
			String allergy) {

		try {

			System.out.println("update data");

			PreparedStatement ps = con.prepareStatement(
					"UPDATE patient SET name = ?,contact=  ?,address =  ?, gender = ?,age = ? ,allergy =? where id=?");
			ps.setInt(7, id);
			ps.setString(1, name);
			ps.setInt(2, contact);
			ps.setString(3, address);
			ps.setString(4, gender);
			ps.setInt(5, age);
			ps.setString(6, allergy);

			int result = ps.executeUpdate();
			if (result == 1)
				return true;

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("not update data");
		}
		return false;

	}

	public boolean DeletePatient(int id) {

		try {

			System.out.println("delete data");

			PreparedStatement ps = con.prepareStatement("DELETE FROM patient WHERE id = ?;");
			ps.setInt(1, id);

			int result = ps.executeUpdate();
			if (result == 1)
				return true;

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("not delete data");
		}
		return false;

	}

	public List<SelectAll>  Plist() {

		try {
		
		PreparedStatement ps = con.prepareStatement( "select * from patient" );
		ResultSet rs = ps.executeQuery();
		
		List<SelectAll> list = new ArrayList<>();
		
		while ( rs.next() ) {
			//record
			int id = rs.getInt( "id" );
			String name = rs.getString( "name" );
			int contact = rs.getInt( "contact" );
			String address = rs.getString( "address" );
			String gender = rs.getString( "gender" );
			int age = rs.getInt( "age" );
			String allergy = rs.getString( "allergy" );
			
			System.out.println(id+" "+name);
			
			SelectAll s = new SelectAll(id,name,contact,address,gender,age,allergy);
			list.add( s );
		}
		return list;
		
	} catch ( Exception ex ) {
		ex.printStackTrace();
	}
		return null;
	
		
	}

//	Hr WOoooooooooooooooooooooooooooooorrrrrrrrrrrrkkkkkkkkkkkkk

	public boolean AddDoctor(int id, String name, int contact, int experience, String degree, String speciality,
			int fee) {

		try {

			System.out.println("insert data");

			PreparedStatement ps = con.prepareStatement("INSERT INTO doctor VALUES(?,?,?,?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, contact);
			ps.setInt(4, experience);
			ps.setString(5, degree);
			ps.setString(6, speciality);
			ps.setInt(7, fee);

			int result = ps.executeUpdate();
			if (result == 1)
				return true;

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("not insert data");
		}
		return false;

	}

	public boolean UpdateDoctor(int id, String name, int contact, int experience, String degree, String speciality,
			int fee) {

		try {

			System.out.println("Upadte data");

			PreparedStatement ps = con.prepareStatement(
					"UPDATE doctor SET name = ?,contact=  ?,experience =  ?, degree = ?,speciality = ? ,fee =? where id=?");
			ps.setInt(7, id);
			ps.setString(1, name);
			ps.setInt(2, contact);
			ps.setInt(3, experience);
			ps.setString(4, degree);
			ps.setString(5, speciality);
			ps.setInt(6, fee);

			int result = ps.executeUpdate();
			if (result == 1)
				return true;

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("not insert data");
		}
		return false;

	}

	public boolean DeleteDoctor(int id) {

		try {

			System.out.println("delete data");

			PreparedStatement ps = con.prepareStatement("DELETE FROM doctor WHERE id = ?;");
			ps.setInt(1, id);

			int result = ps.executeUpdate();
			if (result == 1)
				return true;

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("not delete data");
		}
		return false;

	}

	public <Drshow> List<DrShow> DrList() {

		try {

			PreparedStatement ps = con.prepareStatement("select * from doctor");
			ResultSet rs = ps.executeQuery();

			List<DrShow> list = new ArrayList<>();

			while (rs.next()) {
				// record

				int id = rs.getInt("id");
				String name = rs.getString("name");
				int contact = rs.getInt("contact");
				int experience = rs.getInt("experience");
				String degree = rs.getString("degree");
				String speciality = rs.getString("speciality");
				int fee = rs.getInt("fee");

				DrShow d = new DrShow(id, name, contact, experience, degree, speciality, fee);
				list.add(d);
			}

			return list;

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}
	
	
//	------------------------------------------login data -----------------------------
	
	
	
		
		public boolean LoginConform(String name, String password) {
		    try {
		        PreparedStatement ps = con.prepareStatement("SELECT * FROM login WHERE name = ? AND password = ?");
		        ps.setString(1, name); // Correct order
		        ps.setString(2, password); // Correct order
		        
		        ResultSet rs = ps.executeQuery();
		        
		        if (rs.next()) {
		          
		            return true;
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    
		    return false;
		}

	}
