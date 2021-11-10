package project;
import java.util.ArrayList;
public class Q19 {
	public void arrayList()
	{
		ArrayList<Integer> intList = new ArrayList<>();
		ArrayList<Integer> intListEven = new ArrayList<>();
		ArrayList<Integer> intListOdd = new ArrayList<>();

		int sumEven=0,sumOdd=0;
		for(int i=1;i<=10;i++)
		{
			intList.add(i);
		}
		for(int i:intList)
		{
			if(i%2==0)
			{
				intListEven.add(i);
			}
			else
			{
				intListOdd.add(i);
			}
		}
		for(int i=0;i<intList.size();i++)
		{
			if(numberIsPrime(i))
				intList.remove(i);
		}
		
		for(int i:intListEven)
		{
			System.out.print(" "+i);
			sumEven +=i;
		}
		System.out.print("="+ sumEven);
		System.out.println();
		for(int i:intListOdd)
		{
			System.out.print(" "+i);
			sumOdd +=i;
		}
		System.out.print("="+ sumOdd);
	}
	private boolean numberIsPrime(int number)
	{
		boolean isPrime=true;
		
		for(int j=2;j<number/2;j++)
		{
			if(number%j==0)
			{
				isPrime=false;
			}
		}
		return isPrime;
	}
}
