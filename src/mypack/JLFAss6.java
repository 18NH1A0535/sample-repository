package mypack;

import java.util.regex.Pattern;

public class JLFAss6 {
public static void main(String args[]) {
	String s="message on python";
	if(Pattern.matches(".*\\b[java|python]\\b.*", s))
		System.out.println("valid");
	else
		System.out.println("Invalid");
			
	
}
}
