package project;

public class Q5 {
	public String substring(String str, int indexNumber) {
		String sub_str= " ";
		for(int i=0;i<indexNumber;i++)
		{
			sub_str +=str.charAt(i);
		}
		return sub_str;
	}
}
