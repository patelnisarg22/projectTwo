package project;
import java.util.ArrayList;
public class Q8 {
		public void palindromesString()
		{
			 ArrayList<String> strarr = new ArrayList<>();
			 ArrayList<String> palindromString = new ArrayList<String>();
			 strarr.add("karan");
			 strarr.add("madam");
			 strarr.add("tom");
			 strarr.add("civic");
			 strarr.add("radar");
			 strarr.add("jimmy");
			 strarr.add("kayak");
			 strarr.add("john");
			 strarr.add("refer");
			 strarr.add("billy");
			 strarr.add("did");
			 
			 for(int i=0;i<strarr.size();i++) {
				 if (checkIsPalindrome(strarr.get(i)))
				 {
					 palindromString.add(strarr.get(i));
				 }
					 
			 }
			 
			 System.out.print("Your Palindrome String are :");
			 for(int k=0;k<palindromString.size();k++)
			 {
				 System.out.print(palindromString.get(k) + ", ");
			 }
		}
		static boolean checkIsPalindrome(String str)
	    {
	 
	        int k = 0, j = str.length() - 1;
	 
	        while (k < j)
	        {
	            if (str.charAt(k) != str.charAt(j))
	                return false;
	            
	            k++;
	            j--;
	        }
	 
	        return true;
	    }
}
