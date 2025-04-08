import java.sql.*;
public class Test1 {
public static void main(String[] args)throws Exception {

Class.forName("com.mysql.jdbc.Driver");
Connection connection=
DriverManager.getConnection("jdbc:mysql://localhost:3306/MixedSection"
,"root","root");
String sql="Create Table Student(Id int primary key, Name varchar(30),address varchar(30), email varchar(30), Gender varchar(7))";
Statement statement = connection.createStatement();
statement.execute(sql);

System.out.println("Table Created");
connection.close();
}
}
