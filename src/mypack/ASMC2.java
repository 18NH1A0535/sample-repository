package mypack;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ASMC2 {
	
	private LinkedList runsData;
	public ASMC2()
	{
		this.runsData=new LinkedList<>();
	}
	public void addRunsToList(int runs)
	{
		this.runsData.add(runs);
	}
	double calcRunRate()
	{
		double sum=0;
		for(Object o:this.runsData)
		 {
			sum+=(int)o;
		 }
		return sum/5;
		
	}
	int lowestRunsScored()
	{
		Collections.sort(runsData);
		return (int)runsData.get(0);
	}
	void displayRuns()
	{
		for(Object o:runsData)
		 {
			 System.out.print(o);
		 }
	}
	public static void main(String[] args) {
		 ASMC2 ob=new ASMC2();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Runs");
		 for(int i=0;i<5;i++)
		 {
			 ob.addRunsToList(sc.nextInt());
		 }
		 System.out.print("Runs Scored:");
		 ob.displayRuns();
		 System.out.println();
		 System.out.println("Runrate:"+ob.calcRunRate());
		 System.out.println("Lowest Runs"+ob.lowestRunsScored());
		 System.out.println("Count of player who batted:"+ob.runsData.size());
	}

}
