package edu.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		HTTPError error=null;
		int errorNumber;
		System.out.print("Enter the number of the HTTP error(only 400-406): ");
		errorNumber = Integer.parseInt(read.readLine());
		
		switch (errorNumber) {
		case 400:
			error = HTTPError.BadRequest;
			break;
		case 401:
			error = HTTPError.Unauthorized;
			break;
		case 402:
			error = HTTPError.PaymentRequired;
			break;
		case 403:
			error = HTTPError.Forbidden;
			break;
		case 404:
			error = HTTPError.NotFound;
			break;
		case 405:
			error = HTTPError.MethodNotAllowed;
			break;
		case 406:
			error = HTTPError.NotAcceptable;
			break;
		default:
			System.out.println("No info or wrong number.");
			break;
		}
		System.out.println(error);

	}

}
