

import java.util.Scanner;
public class AppTest {

	
	
	
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in); 
		
	System.out.println("Enter the new word:  ");
	
	String str=sc.nextLine();
	
//		  String str="klashfuiosao176126";
	        String nsNumber="-0123456789";
	        String ns ="";
	        
	        for(int i=0;i<str.length();i++)
	        {
	            for(int j=0;j<nsNumber.length();j++)
	            {
	                if(str.charAt(i)==nsNumber.charAt(j))
	                {
	                    ns +=nsNumber.charAt(j);
	                }
	                    
	            }
	        }
	       	
	        System.out.println(Integer.parseInt(ns));
	}
}
