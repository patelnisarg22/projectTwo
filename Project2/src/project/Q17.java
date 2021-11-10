package project;

import java.util.Scanner;

public class Q17 {
public void simpleinterest() {
		
		double principal,rate,time,interest;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your principal:");
		principal=sc.nextDouble();
		System.out.print("Enter your interest rate:");
		rate=sc.nextDouble();
		System.out.print("Enter your interesttime in Year:");
		time=sc.nextDouble();
		interest = (principal* rate* time)/100;
		System.out.print("Your interest is :" + interest);
		sc.close();
	}
}
