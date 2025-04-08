package com.presidency.DATASOURCE;
import java.sql.*;
public class MYSQLDATASOURCE {
	private Connection c;
	//generate getter setter, constructor

	public Connection getC() {
		return c;
	}

	public void setC(Connection c) {
		this.c = c;
	}

	public MYSQLDATASOURCE(Connection c) {
		super();
		this.c = c;
	}

	public MYSQLDATASOURCE() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/MixedSection"
			,"root","root");
			System.out.println("Connection Established");
		}catch(Exception e) {}
	}

	@Override
	public String toString() {
		return "MYSQLDATASOURCE [c=" + c + "]";
	}
	
	

}
