package task1;

import java.util.Scanner;

import org.omg.CORBA.BAD_CONTEXT;

public class Main {
	
	public enum HTTPError {
		BAD_REQUEST("Неправильний запит"), UNAUTHORIZED("Несанкційонований доступ"), PAYMENT_REQUIRED("Необхідна оплата"), FORBIDDEN("Заборонено"), NOT_FOUND("Не знайдено"), METHOD_NOT_ALLOWED("Неприпустимий метод");
	    private String description;

        private HTTPError(String description) {
            this.description = description;
        }

        public String getDescription() {return description;}
    }
    
	public static void main(String[] args) {
		
		// read 3 float numbers and check: are they all belong to the range [-5,5]
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1-t number");
		float a = sc.nextFloat();
		if ((a <= -5 || a >= 5)) {
			System.out.println("Number " + a + " is not belong to the range [-5,5]");
		} else {
			System.out.println("Number " + a + " belong to the range [-5,5]");
		}
		
		System.out.println("Enter 2-d number");
		float b = sc.nextFloat();
		if (b <= -5 && b >= 5) {
			System.out.println("Number " + b + " is not belong to the range [-5,5]");
		} else {
			System.out.println("Number " + b + " belong to the range [-5,5]");
		}
		
		System.out.println("Enter 3-d number");
		float c = sc.nextFloat();
		if(c <= -5 || c >= 5) {
			System.out.println("Number " + c + " is not belong to the range [-5,5]");
		} else {
			System.out.println("Number " + c + " belong to the range [-5,5]");
		}
		System.out.println();
		
		// read 3 integer numbers and write max and min of them;
		
		int min = (int) a; 
		int max = (int) a;
		if (b>max) { max = (int) b; }
		if (b<min) { min = (int) b; }
		if (c>max) { max = (int) c; }
		if (c<min) { min = (int) c; }
		System.out.println("Minimum value - " + min);
		System.out.println("Maximum value - " + max);
		System.out.println();
		
		// read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)
		
		HTTPError error;
		System.out.println("Enter the number of the error:");
		int errorName = sc.nextInt();
		
		switch (errorName) {
			case 400:
				error =  HTTPError.BAD_REQUEST;
				System.out.println(error);
				System.out.println(error.getDescription());
				break;
			case 401:
				error = HTTPError.UNAUTHORIZED;
				System.out.println(error);
				System.out.println(error.getDescription());
				break;
			case 402: 
				error = HTTPError.PAYMENT_REQUIRED;
				System.out.println(error);
				System.out.println(error.getDescription());
				break;
			case 403:
				error = HTTPError.FORBIDDEN;
				System.out.println(error);
				System.out.println(error.getDescription());
				break;
			case 404:
				error = HTTPError.NOT_FOUND;
				System.out.println(error);
				System.out.println(error.getDescription());
				break;
			case 405:
				error = HTTPError.METHOD_NOT_ALLOWED;
				System.out.println(error.getDescription());
				break;
			default: 
				System.out.println("The name of the error was not found...");
				System.exit(0);		
		}
		sc.close();
	}

}
