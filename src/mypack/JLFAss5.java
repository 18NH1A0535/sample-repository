package mypack;
import java.util.Scanner;
public class JLFAss5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%3==0)
					continue;
				else
				System.out.print(i);
			}
			if(!(i%3==0))
			System.out.println();
		}

	}

}
