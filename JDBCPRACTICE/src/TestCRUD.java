// Perform CRUD for Faculty
// Create a Data Source object for 
// CRUD operation with Faculty custom object
//Service class

import java.sql.PreparedStatement;
import java.util.List;

import com.presidency.DATASOURCE.MYSQLDATASOURCE;
import com.presidency.MODEL.Faculty;

class FacultyDBService {
	private MYSQLDATASOURCE ds;
	private Faculty faculty;
	
	public MYSQLDATASOURCE getDs() {
		return ds;
	}
	public void setDs(MYSQLDATASOURCE ds) {
		this.ds = ds;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	// service for Create
	public void createTable() {
		try {
	String sql="Create table Faculty(fid int primary key, name varchar(20), designation varchar(30), subject varchar(20))";
	ds.getC().createStatement().execute(sql);
	System.out.println("Table Created");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	// service for DML operations
	public int insertFaculty(Faculty f)throws Exception {
		String sql="insert into Faculty values(101,'vijay','Professor','DBMS')";
		return ds.getC().createStatement().executeUpdate(sql);
		}
	
	public int updateFaculty(Faculty f, int fid) throws Exception{
		String sql="update Faculty set name=?, designation=?, subject=? where fid=? ";
		PreparedStatement ps=ds.getC().prepareStatement(sql);
		ps.setString(1, f.getName());
		ps.setString(2, f.getDesignation());
		ps.setString(3, f.getSubject());
		ps.setInt(4, f.getFid());
		return ps.executeUpdate();
	}
	public int deleteFaculty(int fid) {
		return 0;
	}
	// service for DQL operations
	public List<Faculty> fetchAll() {
		return null;
	}
}
public class TestCRUD {
	public static void main(String[] args) throws Exception{
       MYSQLDATASOURCE ds=new MYSQLDATASOURCE();
       Faculty ob=new Faculty();
       FacultyDBService service=new FacultyDBService();
       service.setDs(ds);
       service.createTable();
       service.insertFaculty(ob);
       System.out.println("Record Inserted");
       ob.setFid(101);
       ob.setName("vinay");
       ob.setDesignation("Asst. Professor");
       ob.setSubject("OS");
       service.updateFaculty(ob, ob.getFid());
       System.out.println("Record Updated");
       
	}

}
