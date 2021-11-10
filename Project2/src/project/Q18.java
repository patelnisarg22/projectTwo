package project;
abstract class StringOpration{
	public abstract void checkUpperCase(String str);
	public abstract void convertToUpperCase(String str);
	public abstract void CovertToInt(String str);
}
public class Q18 extends StringOpration {
	public void checkUpperCase(String str){
		 String lowerCase = str.toLowerCase();
		 if(lowerCase.equals(str))
		 {
			 System.out.println("String '"+str + "' not have Uppercase");
		 }
		 else
		 {
			 System.out.println("String '"+str + "' have Uppercase");
		 }
	}
	public void convertToUpperCase(String str) {
		String upperCase = str.toUpperCase();
		System.out.println("String '"+str + "' in Uppercase : " + upperCase);
	}
	public void CovertToInt(String str) {
		int intString=(Integer.parseInt(str))+10;
		System.out.println("Your result after added 10 in String is: "+ intString);
		
	}
}
