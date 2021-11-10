package project;


public class Q16 {
	public void commandLine(String[] argument)
	{
		for(String args:argument)
		{
			 System.out.print("The number of characters in the String " + args + " is: ");
	         System.out.print(args.length());
	         System.out.println();
		}
	}
}
