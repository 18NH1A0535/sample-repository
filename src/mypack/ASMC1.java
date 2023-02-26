package mypack;
import java.util.*;
public class ASMC1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList al=new ArrayList();
		int marks,num;
		System.out.println("Enter no.of students");
		num=sc.nextInt();
		System.out.println("Enter marks");
		
		for(int i=0;i<num;i++)
		{
			al.add(sc.nextInt());
		}
		double sum=0;
		for(int i=0;i<num;i++)
		{
			Object n=al.get(i);
			sum+=(int)n;
		}
		double avg = sum/num;
		Collections.sort(al);
		System.out.println("Highest marks:"+al.get(num-1));
		System.out.println("Average Marks:"+avg);
		System.out.println("3rd Student marks:"+al.get(2));
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
