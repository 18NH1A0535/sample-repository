
public class oopsdemo {
	public void addition(int a,int b)
	{
		System.out.println(a+b);
	}
	public void addition(float a,int b)
	{
		System.out.println(a+b);
	}
	public void addition(int a,float b)
	{
		System.out.println(a+b);
	}
	public void addition(float a,float b)
	{
		System.out.println(a+b);
	}
	public double addition(double a,double b)
	{
		return(a+b);
	}
	public static void main(String[] args) {
		oopsdemo oopsdemo1 = new oopsdemo();
		// TODO Auto-generated method stub
		oopsdemo1.addition(3, 3);
		oopsdemo1.addition(2.5f,4);
		oopsdemo1.addition(4,2.6f);
		oopsdemo1.addition(3.4f,3.4f);
		System.out.println(oopsdemo1.addition(5.6,4.8));
		
	}

}
