package project;

public class Q3 {
	public void stringReverse()
	{
		String demoString="ABCD";
		String rev_string = " ";
		
			for(int j=demoString.length()-1;j>=0;j--)
			{
				rev_string += demoString.charAt(j);
			}
		System.out.print("Your Main String is :"+ demoString + " , ");
		System.out.print("Reverse String is :"+ rev_string);
	}
}
