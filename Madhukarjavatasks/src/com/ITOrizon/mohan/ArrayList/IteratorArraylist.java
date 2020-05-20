//to iterate through all elements in a array list.
package com.ITOrizon.mohan.ArrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorArraylist
{

	public static void main(String[] args)
	{
		//here im creating an object of ArrayList
		ArrayList<Integer> arrayList =new ArrayList<Integer>();
		//adding an element to the ArryList
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		//adding all the elements to the iterator() and its return type is Iterator
		Iterator i=arrayList.iterator();
		//checking the presence of each element in the iterator
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
