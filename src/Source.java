import java.util.Scanner;

//import src.mypack1.Scanner;
public class Source {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int days,x=10,y=12;
		days=sc.nextInt();
		System.out.println("No.of weeks: "+days/7+"\nNo.of days: "+days%7);
		System.out.println((x>y)&&(x==12));
		y%=++x;
		System.out.println(x+" "+y);

	}

}
