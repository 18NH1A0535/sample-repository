package com.capg;
import java.util.StringTokenizer;
class StringManipulation
{
	public int StringManipulation()
	{
		return 0;
	}
	//replacing characters,strings
	public String replaceVowels(String message)
	{
		String replace=message.replace('a','?');
		String replace1=message.replaceAll("[^AEIOUeiou]","!");
		return replace1;
	}
	
	//String splitting
	public void splitString(String st,String input)
	{
		String splits[]=st.split(" ");
		for(String s:splits)
			System.out.println(s);
		
		//split using user input
		String splits1[]=st.split(input,2);//giving limit of 2 sentences
		for(String s:splits1)
			System.out.println(s);
		
		//split string using regex
	//...to be written
		
		//count character repetitions
		long count=st.chars().filter(ch->ch=='o').count();
		System.out.println(count);
		
		 
	}
	//String Tokenizer
			/*
			 Given a String of numbers. Convert the String into tokens and return the sum of the numbers
			  */
	public int StringTokenizerDemo(String message)
	{
		StringTokenizer st=new StringTokenizer(message," ");
		int token,sum=0;
		while(st.hasMoreTokens())
		{
			token=Integer.parseInt(st.nextToken());//converting string to integer
			sum+=token;
		}
		return sum;
	}
}
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringManipulation sm=new StringManipulation();
		System.out.println(sm.replaceVowels("Capgemini101AWS10"));
		sm.splitString("When in Rome,do as Romans",",");
		int n=sm.StringTokenizerDemo("1 2 3");
		System.out.println(n);
		
	}

}
