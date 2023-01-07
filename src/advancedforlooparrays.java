
public class advancedforlooparrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {23,37,25,88,55,82,45};
		int min=99,max=0;
		for(int x:arr)
		{
			if(x<min)
				min=x;
			if(x>max)
				max=x;
		}
		System.out.println(min+" "+max);
	}

}
