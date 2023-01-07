package mypack;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class ColourCodeValidator
{
  static int validateHexCode(String st)
  {
     //int n=1;
     String regex="^#([A-Fa-f0-9]{6})$";//starts with #,contains the given pattern and length should be 6
     Pattern p=Pattern.compile(regex);
     Matcher m=p.matcher(st);
     if(m.matches()==true)
    	 return 1;
     else
    	 return 1;
     /*if(st.charAt(0)=='#'&& st.length()==7 && st.matches("^[A-F0-9]*$"))
     {
         return n;
     }
     else
     {
         n=-1;
         return -1;
     }
     */
  
  }
  static int validateDecimalCode(String st)
  {
      int n,n1=1;
      String splits[]=st.split(",");
      for(String x:splits)
      {
      n=Integer.parseInt(x);
      if(n>=0&&n<=255)
      n1=1;
      else
      n1=-1;
      }
      return n1;
  }
}
public class Source
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
      String st,s;
      int n,n2=0;
      st=sc.nextLine();
      String splits[]=st.split(" ");
      n=Integer.parseInt(splits[0]);
      s=splits[1];
      
      if(n==1)
      n2=ColourCodeValidator.validateHexCode(s);
      else if(n==2)
      n2=ColourCodeValidator.validateDecimalCode(s);
      else
      System.out.println("Invalid choice");
      
      if(n2==1)
      System.out.println("Valid Code");
      if(n2==-1)
      System.out.println("Invalid Code");
  }
}  
  