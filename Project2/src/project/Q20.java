package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q20 {
	public void fileHandling()
	{
		ArrayList<String> fristName = new ArrayList<>();
		ArrayList<String> lastName = new ArrayList<>();
		ArrayList<String> State = new ArrayList<>();
		ArrayList<Integer> age = new ArrayList<>();
		 try {
		      File myObj = new File("C:\\Users\\nisar\\eclipse-workspace\\Project2\\src\\project\\Data.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        String fname="",lname="";
	        	String candidateState="";
	        	String candidateAge="";
		        
		        	int i=0;
		        	while(data.charAt(i)!=':')
		        	{
		        		
		        		fname += data.charAt(i);
		        		i++;
		        	}
		        	i++;
		        	while(data.charAt(i)!=':')
		        	{
		        		
		        	
		        		lname += data.charAt(i);
		        		i++;
		        	}
		        	i++;
		        	
		        	while(data.charAt(i)!=':')
		        	{
		        		candidateAge+= data.charAt(i);
		        		i++;
		        	}
		        	i++;
		        	for(;i<data.length();i++)
		        	{
		        		candidateState+= data.charAt(i);
		
		        	}
		        	
		        
		        fristName.add(fname);
		        lastName.add(lname);
	        	State.add(candidateState);
	        	age.add(Integer.parseInt(candidateAge));
		        System.out.println(data);
		      }
		      for(int i=0;i<fristName.size();i++)
		        {
		        	System.out.println("Name:" + fristName.get(i)+ " "+ lastName.get(i));
		        	System.out.println("Age:" + age.get(i));
		        	System.out.println("State:" + State.get(i));
		        	System.out.println("----------------------------------------");
		        }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred." +e.getMessage());
		      e.printStackTrace();
		    }
	}
}
