package JavaCodePractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateNumbersArray {

	public static void main(String[] args) {

		int [] a={2,2,4,5,3,5,4,9,9}; //remove duplicate and print those
		ArrayList list= new ArrayList();
		for(int i=0; i<a.length; i++)
		{
			boolean isDuplicate=false;
		
				for(int j=i+1; j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						isDuplicate=true;
						list.add(a[i]);
						break;
					}
				}
				if(!isDuplicate)
				{
					System.out.print(a[i]+" ");
				}
			}
		
		System.out.println("Duplicate numbers in list:"+list);
		//using set
		Set set=new HashSet();
		
		for(int i:a)
		{
			set.add(i);
		}
		System.out.println("Without Duplicates:"+set);
	
	}
}
