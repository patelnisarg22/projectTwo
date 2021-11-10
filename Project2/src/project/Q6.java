package project;

public class Q6 {
	public void checkEven()
	{
		int number=517;
		boolean numberIsEven=false;
		for(int i=1;i<=number;i++)
		{
			if(i*2 == number)
			{
				numberIsEven=true;
				break;
			}
		}
		if(numberIsEven == true)
		System.out.print("Your number "+number+ " is even");
		else
		System.out.print("Your number "+number+ " is not even");
	}
}
