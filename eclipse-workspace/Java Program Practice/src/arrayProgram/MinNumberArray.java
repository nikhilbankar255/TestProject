package arrayProgram;

import java.util.HashSet;

public class MinNumberArray {

	public static void main(String[] args) {
	
		HashSet hs= new HashSet(100,(float)0.90);
		
		hs.add(100);
		hs.add("A");
		hs.add("Nik");
		hs.add(50);
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs);
	
		hs.remove("Nik");
		System.out.println("After remove:"+hs);
	
		if(hs.contains("Nik"))
		{
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
		
		HashSet <Integer> number =new HashSet<Integer>();
		number.addAll(hs);
		number.add(100000);
		System.out.println("Final order:"+number);
	}
	
	/*
	 * int a[]= {10, 50 ,80 ,90,7,6000};
		int val=a[0];
		
		
		for(int i=0;i<a.length;i++)
		{
		 if(a[i]<val)
		{
			val=a[i];
		}
		}
		System.out.println("Minmum number in array is : " +val);
	 */
	
	
	}