package mypack;
import java.util.Scanner;
public class JPFAss2 {

	public static void main(String[] args) {
		// Calculate electricity bill
		int prev_read,curr_read,units_consum,read;
		float bill=0f;
		
		Scanner sc=new Scanner(System.in);
		prev_read=sc.nextInt();
		curr_read=sc.nextInt();
		units_consum=curr_read-prev_read;	
		
		if(units_consum>0 && units_consum<=30) 
		{
			bill+=(units_consum)*2.3;
		}
		if(units_consum>30)	//251>30-t
		{
			bill+=(30)*2.3;
			units_consum-=30;//251-30=181
		}
		if(units_consum>0&&units_consum<=70)
		{
			bill+=(units_consum)*3.5;
		}
		if(units_consum>70)
		{
			units_consum-=70;
			bill+=(70)*3.5;
		}
		if(units_consum>100)
		{
			bill+=(units_consum)*4.6;
		}
		
		//System.out.printf("Bill Amount is %. 2f"+bill);
		System.out.println(String.format("%.2f"+ bill));//rounding double to 2 decimal places
	}

}
