
public class Calculator {
public void addition(String s,int...a)
{
	int total=0;
	for(int x:a)
		total+=x;
	System.out.println("Addition of "+a.length+" numbers= "+total);
}
}
