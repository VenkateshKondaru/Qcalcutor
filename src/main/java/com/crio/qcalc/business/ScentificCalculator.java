package com.crio.qcalc.business;

public class ScentificCalculator extends StandardCalculator {

	public static void getVersion(){
		System.out.println("Scientific Calculator 1.0");

	}

	public final void sin(double a) {
		result=Math.sin(a);
	}

	public final void cos(double a){
		result = Math.cos(a);
	}

	public final void square(double a){
		multiply(a,a);
	}

	public final void cube(double a){
		multiply(a,a);
		multiply(result,a);
	}

	public final void tan(double a) {
		result=Math.tan(a);
	}


	public final void log(double a) {
		result=Math.log(a);
	}


	public final void sqrt(double a) {
		result=Math.sqrt(a);
	}


	public final void  cbrt(double a) {
		result=Math.cbrt(a);
	}
	
	@Override
	public void printResult(){
		System.out.println("Scientific Calculator Result:"+ result );
	}

}
