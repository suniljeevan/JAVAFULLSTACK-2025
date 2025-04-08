// DML - Update Dynamically

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
	     System.out.println("Driver Loaded");
	     Connection c=DriverManager.getConnection(
	    		   "jdbc:mysql://localhost:3306/mixedsection","root","root");
	     System.out.println("Connection Established");
	     String query="update student set name=?,address=?,email=?,gender=? where id=?";
	     PreparedStatement p=c.prepareStatement(query);
	     int id;
	     String name,address,email,gender;
	     char choice='y';
	     Scanner sc=new Scanner(System.in);
	     do {
	     System.out.println("Enter Student Details");
	     id=sc.nextInt();
	     name=sc.next();
	     address=sc.next();
	     email=sc.next();
	     gender=sc.next();
	     p.setInt(5, id);
	     p.setString(1, name);
	     p.setString(2, address);
	     p.setString(3, email);
	     p.setString(4, gender);
	     int response=0;
	     response=p.executeUpdate();
	     System.out.println(response+" record updated");
	     System.out.println("Enter choice y or n");
	     choice=sc.next().charAt(0);
	     }while(choice!='n');
	     System.out.println("Thank You");
	     c.close();
	     System.out.println("Connection closed");
	}

}
