package project;

import java.time.LocalDate;
import java.util.Scanner;

public class Q14 {
		public void demoSwitchCase()
		{
			int ch;
			
			System.out.println("Case 1: Find the square root of a number using the Math class method.\r\n"
					+ "Case 2: Display today’s date.\r\n"
					+ "Case 3: Split the following string  “I am learning Core Java” ");
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Your Choice:");
			ch= sc.nextInt();
			switch(ch)
			{
				case 1 :
					double squareRoot;
					System.out.print("Enter Your Number:");
					squareRoot=sc.nextDouble();
					System.out.print("Your Answer is:" + Math.sqrt(squareRoot));
					break;
				case 2:
					LocalDate todaydate = LocalDate.now();
					System.out.print("Today's Date is: " + todaydate);
					break;
				case 3:
					String mainString="I am learning Core Java";
					String[] splitString= mainString.split("\\s");
					for(String s:splitString)
					{
						System.out.println(s);
					}
					break;
				default :
					System.out.print("Enter apropriate choice:");
					
			}
			sc.close();
		}
}
