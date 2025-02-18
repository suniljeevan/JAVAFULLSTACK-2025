//Demonstrate List collection for custom object

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Student {
	private int id;
	private String name;
	private double cgpa;
	private String address;
	//add getter and setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student(int id, String name, double cgpa, String address) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
		this.address = address;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cgpa=" + cgpa + ", address=" + address + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, cgpa, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address)
				&& Double.doubleToLongBits(cgpa) == Double.doubleToLongBits(other.cgpa) && id == other.id
				&& Objects.equals(name, other.name);
	}
}
public class TEST2 {
	public static void main(String[] args) {
       List<Student> studentList=new ArrayList<Student>();
       studentList.add(new Student(100,"amith",7.8,"bengaluru"));
       studentList.add(new Student(101,"vishwas",8.8,"hyderabad"));
       studentList.add(new Student(102,"priyanka",6.8,"punjab"));
       studentList.add(new Student(103,"karthik",7.5,"chennai"));
       studentList.add(new Student(104,"neelam",8.7,"bengaluru"));
       studentList.add(new Student(105,"lathika",7.2,"andhra pradesh"));
       studentList.add(new Student(106,"aakash",4.8,"kolkata"));
       studentList.add(new Student(107,"sakshi",6.6,"bengaluru"));
       studentList.add(new Student(108,"ayush",7.8,"mumbai"));
       studentList.add(new Student(109,"bishal",5.9,"delhi"));
	}

}






