package project;

public class Q12 {
	public void checkEvenNumber()
	{
		int[] number= new int[100];
				for(int i=0;i<100;i++)
				{
					number[i]=i+1;
					
				}
				
			for(int num:number)
				{
					
					if (num%2==0)
						System.out.print(" "+ num);
				}
				
	}
}
