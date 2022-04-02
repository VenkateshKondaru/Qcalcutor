package com.crio.qcalc.business;

public class StandardCalculator {
	protected double result;

	public static void getVersion(){ //static - memory management and gets memory only once in the class area at the time of class loading
		System.out.println("Standard Calculator 1.0");
	}

	public double getResult() {
		return result;
	}

	/*
	 * There are some interesting use cases for setters,
	 * setter method to act more like the "C" or “AC” function in a calculator to clear the value of any intermediate operations. It gets triggered only when the value being passed is 0.
	 * Otherwise it does not interfere with the result of the operation.
	 */
	//	public void setResult(int value) {
	//		if (value != 0)
	//			return;
	//		this.result = value;
	//	}

	/*
	 * but for this application we will simply replace the above validated setter method with the following method.
	 */
	public void clearResult() {
		result = 0;
	}


	public void printResult(){
		System.out.println("Standard Calculator Result:"+ result);
	}


	public final void add(int num1, int num2) {
		add((double) num1, (double) num2);
	}

	public final void add(double num1, double num2) {
		double result= (num1+num2);
		System.out.println("add "+result);
		if(result==-Double.MAX_VALUE||result==Double.POSITIVE_INFINITY ||result==Double.NEGATIVE_INFINITY || result==Double.MAX_VALUE ) {
			throw new ArithmeticException("Double overflow");
		}
		this.result=result;
	}

	public final void subtract(int num1, int num2) {
		subtract((double) num1,(double) num2);
	}


	public final void subtract(double num1, double num2) {
		double result=  (num1-num2);
		System.out.println("subtract :"+result);
		if(result==-Double.MAX_VALUE||result==Double.POSITIVE_INFINITY ||result==Double.NEGATIVE_INFINITY || result==Double.MAX_VALUE ) {
	        throw new ArithmeticException("Double overflow");
		}
		this.result=result;
	}


	public final void multiply(int num1, int num2) {
		multiply((double) num1,(double) num2);
	}

	public final void multiply(double num1, double num2) {
		double result=  (num1*num2);
		System.out.println("multiply :"+result);
		if(result==-Double.MAX_VALUE||result==Double.POSITIVE_INFINITY ||result==Double.NEGATIVE_INFINITY || result==Double.MAX_VALUE ) {
	        throw new ArithmeticException("Double overflow");
		}
		this.result=result;
	}

	public final void divide(int num1, int num2) {
		divide((double) num1,(double) num2);
	}

	public final void divide(double num1, double num2) {
		double result=  (num1/num2);
		System.out.println("divide :"+result);
		if(result==-Double.MAX_VALUE||result==Double.POSITIVE_INFINITY ||result==Double.NEGATIVE_INFINITY || result==Double.MAX_VALUE ) {
	        throw new ArithmeticException("Double overflow");
		}
		this.result=result;
	}

}
