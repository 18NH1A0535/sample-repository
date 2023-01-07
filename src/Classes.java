
public class Classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {23,37,25,88,55,82,45};
		int sum1=0,sum2=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				sum1+=arr[i];
			else
				sum2+=arr[i];
		}
		System.out.println("Sum of even numbers: "+sum1);
		System.out.println("Sum of odd numbers: "+sum2);
	}

}
