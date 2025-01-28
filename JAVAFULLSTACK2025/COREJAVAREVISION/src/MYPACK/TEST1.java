package MYPACK;
//Section for Services 
// These are also classes/interfaces without main
// or can be imported from the same or different package

//Client class
public class TEST1 {
	public static void main(String[] args) {
         CalculatorService c=new CalculatorService();
         c.setInputData1(10);
         c.setInputData2(20);
         double r=c.add();
         System.out.println("Addition is "+r);
	}

}





