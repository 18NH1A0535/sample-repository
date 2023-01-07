import java.util.*;
public class ternaryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		double accno,withdraw,balance;
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		accno=sc.nextDouble();
		balance=20000;
		System.out.println("Enter withdrawl amount");
		withdraw=sc.nextDouble();
		double res;
		res=withdraw-balance;
		System.out.println(res>balance?withdraw-balance:"Insufficient balance");
	}

}
