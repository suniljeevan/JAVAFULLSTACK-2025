package MYPACK;
//Calculator service 
// suffix must be Service
public class CalculatorService {
	private double inputData1;
	private double inputData2;
	private double result;
	// Constructor  Alt Shift S
	public CalculatorService() {
		super();
	}
	public CalculatorService(double inputData1, double inputData2) {
		super();
		this.inputData1 = inputData1;
		this.inputData2 = inputData2;
	}
	// Alt shift S select getter and setter
	public double getInputData1() {
		return inputData1;
	}
	public void setInputData1(double inputData1) {
		this.inputData1 = inputData1;
	}
	public double getInputData2() {
		return inputData2;
	}
	public void setInputData2(double inputData2) {
		this.inputData2 = inputData2;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	//business logic methods
	public double add() {
		result=inputData1+inputData2;
		return result;
	}
	public double subtract() {
		result=inputData1-inputData2;
		return result;
	}
	public double multiply() {
		result=inputData1*inputData2;
		return result;
	}
	public double divide() {
		result=inputData1/inputData2;
		return result;
	}

}
