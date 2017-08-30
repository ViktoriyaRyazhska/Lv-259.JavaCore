package Homework;

public class Div {
		
	public double div  (double a, double b) throws ArithmeticException{
		if (b!=0){return a/b;} else{
		throw new ArithmeticException();
		}
	}

}
