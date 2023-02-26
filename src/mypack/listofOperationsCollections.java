package mypack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class ArrayListOps
{
	public ArrayList<Integer> makeArrayListInt(int n)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			al.add(i,0);
		}
		if(n==4)
			return al;
		return al;
	}
	public ArrayList<Integer> reverseList(ArrayList<Integer> list)
	{
		int n=list.size();
		ArrayList<Integer> rev=new ArrayList<>();
		for(int i=n-1;i>=0;i--)
		{
			rev.add(list.get(i));
		}
		
		return rev;
	}
	public ArrayList<Integer> changeList(ArrayList<Integer> list,int m,int n)
	{
		for(int i=0;i<list.size();i++)
		{
			if((int)list.get(i)==m)
			{
				list.add(i, n);
				list.remove(i+1);
			}
		
		}
		
		return list;
		
	}
}
public class listofOperationsCollections {

	public static void main(String[] args) {
		ArrayListOps a=new ArrayListOps();
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 25, 33, 28, 10, 12));
		System.out.println(a.makeArrayListInt(4));
		list=a.reverseList(list);
		System.out.println(list);
		System.out.println(a.changeList(list,28,20));
		
	}

}
