//fetching all records
// fetching one record

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test6 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
	     System.out.println("Driver Loaded");
	     Connection c=DriverManager.getConnection(
	    		   "jdbc:mysql://localhost:3306/mixedsection","root","root");
	     System.out.println("Connection Established");
	     String query="select * from student";
	     Statement s=c.createStatement();
	    ResultSet response= s.executeQuery(query);
	    System.out.println("Student Details fetched");
	    while(response.next()) {
	    	System.out.printf("%-10s",response.getInt(1));
	    	System.out.printf("%-10s",response.getString(2));
	    	//System.out.print(response.getString(2)+" ");
	    	System.out.printf("%-12s",response.getString(3));
	    	System.out.printf("%-20s",response.getString(4));
	    	System.out.printf("%-25s",response.getString(5));
	    	System.out.println();
	    }
	    System.out.println("Thank You");
	    c.close();
	    System.out.println("Connection Closed");
	}

}




