import java.util.*;
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t,num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		System.out.println("Enter a number");
		for(int i=1;i<=10;i++)
		{
			t=num*i;
			System.out.println(num+" * "+i+"="+t);
		}
		//factorial of a number
		num=sc.nextInt();
		t=1;
		for(int i=1;i<=num;i++)
		{
			t=t*i;
		}
		System.out.println("the factorial is: "+t);

	}

}
