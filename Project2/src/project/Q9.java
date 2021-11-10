package project;

import java.util.ArrayList;

public class Q9 {
	public void PrimeNumber()
	{
		ArrayList<Integer> primeNumber = new ArrayList<Integer>();
		
		for(int i=1;i<=100;i++)
		{
			boolean isPrime=true;
			primeNumber.add(i);
			
			for(int j=2;j<i/2;j++)
			{
				if(i%j==0)
				{
					isPrime=false;
				}
			}
			if(isPrime)
			{
				System.out.print(" " +i);
			}
			
		}
	}
}
