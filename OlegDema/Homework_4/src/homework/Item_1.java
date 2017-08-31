package homework;

import java.util.Scanner;

public class Item_1 {
	
	public void math(int a1,int a2,int a3){
		int max = 0 ;
		int min = 0 ;
        if(a1>a2){
        	if(a1>a3){
        		max = a1;
        	}else{
        		max = a3;
        	}
        }else{
        	if(a2>a3){
        		max = a2;        		
        	}else{
        		max = a3;
        	}
        }
        
        if(a1<a2){
        	if(a1<a3){
        		min = a1;
        	}else{
        		min = a3;
        	}
        }else{
        	if(a2<a3){
        		min = a2;        		
        	}
        }
System.out.println("Max: "+ max);
System.out.println("Min: "+min);
		
	}
	
	public void error(int a){
		switch(a){
		case 400: System.out.println("Bad Request");
			break;
		case 401: System.out.println(" Unauthorized");
			break;
		case 402: System.out.println("Payment Required");
			break;
		case 403: System.out.println("Forbidden");
			break;
		case 404: System.out.println("Not Found");
			break;
		default: System.out.println("Bad code");
		
		
		}
	}
	
	public void range(float num1, float num2, float num3){
		if((num1 >=(-5) && num1 <= 5) && (num2 >=(-5) && num2 <= 5) && (num3 >=(-5) && num3 <= 5)){
			System.out.println("TRUE");
		}else{
			System.out.println("FALSE");
		}
	}

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		Item_1 item = new Item_1();
//		
//		System.out.println("Enter tree float number");
//		float num1 = scanner.nextFloat();
//		float num2 = scanner.nextFloat();
//		float num3 = scanner.nextFloat();
//		item.range(num1, num2, num3);		
//		
//		System.out.println("Enter three integer numbers");
//		int a = scanner.nextInt();
//		int b = scanner.nextInt();
//		int c = scanner.nextInt();		
//		item.math(a, b, c);
//		
//		System.out.println("Enter code 400-404");
//		int error = scanner.nextInt();
//		item.error(error);
		
		
		
		
		
		
	}

}
