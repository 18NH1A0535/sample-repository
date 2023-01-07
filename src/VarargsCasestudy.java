import java.util.Scanner;
public class VarargsCasestudy {
	public void calculate(int exams,int...a) throws CountByZeroException
	{
		int total=0;
		for(int x:a)
			total+=x;
		
		//using Userdefined exception
		if(a.length==0)
			throw new CountByZeroException("Zero count found");
		
		double avg=total/exams;
		System.out.println("total: "+total+"avg: "+avg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int exams;
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		exams=sc.nextInt();
		VarargsCasestudy vc=new VarargsCasestudy();
		int[] arr=new int[exams];
		
		for(int i=0;i<exams;i++)
			arr[i]=sc.nextInt(); //taking input array of parameters
		
		try
		{
		vc.calculate(exams,arr);
		}
		catch(CountByZeroException ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
