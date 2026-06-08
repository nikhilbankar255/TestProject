package JavaCodePractice;

import java.util.ArrayList;
import java.util.Collections;

public class Merge2Arrays {

	public static void main(String[] args) {
		int a[]= {10,20,40,60};
		int b[]= {30,50,70,80};
		
		ArrayList list = new ArrayList();
		
		for(int i: a)
		{
			list.add(i);
		}
		
		for(int i: b) {
			list.add(i);
		}
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println("After sort:"+list);

	}

}
