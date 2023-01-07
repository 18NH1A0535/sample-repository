import java.util.*;
public class nestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(int i=num;i<num+5;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}
	}

}
