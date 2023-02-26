package mypack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class ASMC3 {

	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap<String,Integer>();
		System.out.println("Enter runs scored");
		Scanner sc=new Scanner(System.in);
		int runs,sum=0;
		String names;
		for(int i=0;i<5;i++)
		{
			m.put(sc.next(), sc.nextInt());
		}
		 Set set=m.entrySet(); //Converting to Set so that we can traverse  
		 Iterator itr=set.iterator();  
		 while(itr.hasNext()){  
		 //Converting to Map.Entry so that we can get key and value separately  
		    Map.Entry entry=(Map.Entry)itr.next();  
		    sum+=(int)entry.getValue();
		    System.out.println(entry.getKey());	//getting keys
		  }
		 Iterator it=set.iterator(); 
		    while(it.hasNext()){  
	        //Converting to Map.Entry so that we can get key and value separately  
	        Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+":"+entry.getValue());
		    }
		    System.out.println("Total Score:"+sum);
		    List l=new ArrayList<>();
//		    l=m.entrySet().stream().sorted(Map.Entry.comparingByValue().collect(Collectors.toList()));
	//	    System.out.println("Name of the highest scorer:"+Math.max(l));
}
}
