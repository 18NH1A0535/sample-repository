package com.capg;

class Demo
{
	int x;
	static int y;
	public void meth()
	{
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}
	public static void counting() {
		System.out.println("y: "+y);
	}
	
}
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo obj=new Demo();
		obj.x=12;
		obj.meth();//12 0
		Demo obj1=new Demo();
		obj1.x++;
		obj1.meth();//1 0
		obj.counting();//0
		obj1.y++;
		obj1.counting();//1
	}

}
