package com.presidency.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
public class InsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public InsertController() {
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mixedsection","root","root");
			String sql="insert into faculty values(?,?,?,?)";
			PreparedStatement p=c.prepareStatement(sql);
			int id=Integer.parseInt(request.getParameter("id"));
			String name=request.getParameter("name");
			String designation=request.getParameter("designation");
			String subject=request.getParameter("subject");
			p.setInt(1, id);
			p.setString(2, name);
			p.setString(3, designation);
			p.setString(4, subject);
			p.executeUpdate();
			response.setContentType("text/html");
			response.getWriter().print("<h2>"+"record inserted"+"</h2>");
			}catch(Exception e) {
				System.out.println(e);
			}
		
	}

}





