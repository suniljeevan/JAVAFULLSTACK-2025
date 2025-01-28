// class-relationship
package MYPACK;
//abstraction
// abstract keyword is necessary
// 0 or more methods abstract
abstract class shape {
	// one abstract method 1
	public abstract void area();
	// one abstract method 2
	public abstract void volume();
	// one non-abstract method
	// helps in backward-compartibilty
	public void showRules() {
		System.out.println("Guideline 1 : area for 2D shape");
		System.out.println("Guideline 2 : volume for 3D shape");
		
	}
}

// implemented class
class shapeimpl extends shape {
	// implement 1 nd 2
	int d;
	public shapeimpl(int d) {
		this.d=d;
	}
	public shapeimpl() {
		
	}
	public void area() {
		if(d!=2) 
			System.out.println(" Guidelines Violated");
		else
			System.out.println("Read data to print area");
	}
	public void volume() {
		if(d!=3) 
			System.out.println(" Guidelines Violated");
		else
			System.out.println("Read data to print volume");
	}
}


public class TEST2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
