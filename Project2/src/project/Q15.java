package project;
interface doMath
{
	public int addition(int a,int b);
	public int subtraction(int a,int b);
	public int multiplication(int a,int b);
	public int division(int a,int b);
}
class ImplementIterface implements doMath {
	public int addition(int a,int b) {return a+b;}
	public int subtraction(int a,int b) { return a-b;}
	public int multiplication(int a,int b) { return a*b;}
	public int division(int a,int b) { return a/b;}
}
public class Q15 {
	public void test()
	{
		ImplementIterface math = new ImplementIterface();
		math.addition(1, 2);
		math.division(5, 4);
		math.subtraction(8, 9);
		math.multiplication(5, 0);
		System.out.print("Addition of 1 and 2 :"+math.addition(1, 2)+"\tDivision of 5 and 4:"+math.division(5, 4)+ "\tSubtraction of 8 and 9 :"+math.subtraction(8, 9)+ "\t multiplication of 5 and 0 is:"+math.multiplication(5, 0));
	}
}
