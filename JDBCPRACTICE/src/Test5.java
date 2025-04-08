//Delete - Dynamically

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
	     System.out.println("Driver Loaded");
	     Connection c=DriverManager.getConnection(
	    		   "jdbc:mysql://localhost:3306/mixedsection","root","root");
	     System.out.println("Connection Established");
	     String query="delete from student where id=?";
	     PreparedStatement p=c.prepareStatement(query);
	     int id;
	     char choice='y';
	     Scanner sc=new Scanner(System.in);
	     do {
	     System.out.println("Enter Student ID");
	     id=sc.nextInt();
	     p.setInt(1, id);
	    int response=p.executeUpdate();
	     System.out.println(response+" record deleted");
	     System.out.println("Enter choice y or n");
	     choice=sc.next().charAt(0);
	     }while(choice!='n');
	     System.out.println("Thank You");
	     c.close();
	     System.out.println("Connection closed");

	}

}
