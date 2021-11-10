package project;

public class Q13 {
	public void drawPattern()
	{
		int i=0,j=0,level=5;
		int count=0;
		for(i=0;i<level;i++)
		{
			for(j=0;j<=i;j++)
			{
				if(count%2==0)
					System.out.print("0");
				else {
					System.out.print("1");
				}
				count++;
			}
			System.out.println("");
		}
			
	}
}
