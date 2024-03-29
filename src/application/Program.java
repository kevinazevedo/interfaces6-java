package application;

import java.util.Scanner;

import service.InterestService;
import service.UsaInterestService;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = scan.nextDouble();
		System.out.print("Months: ");
		int months = scan.nextInt();
		
		InterestService is = new UsaInterestService(2.0);
		double payment = is.payment(amount, months);
		
		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", payment));
		
		scan.close();
	}
}
