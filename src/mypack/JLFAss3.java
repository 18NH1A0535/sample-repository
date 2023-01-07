package mypack;
import java.util.Scanner;
public class JLFAss3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius;
		String output;
		Scanner sc=new Scanner(System.in);
		radius=sc.nextInt();
		sc.nextLine();
		output=sc.nextLine();
		
		switch(output.toUpperCase())
		{
		case "DIA":
			System.out.println("Diameter of circle is "+2*radius);
			break;
		case "AR":
			System.out.println("Area of circle is "+Math.PI*radius*radius);
			break;
		case "PER":
			System.out.println("Perimeter of circle is "+Math.PI*radius*2);
			break;
		case "ARSEM":
			System.out.println("Area of  semi circle is "+Math.PI*radius);
			break;
			default:
				System.out.println("");
		}
	}

}
