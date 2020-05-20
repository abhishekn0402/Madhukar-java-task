package com.ITOrizon.mohan.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Hashsettoarraylist {

	public static void main(String[] args)
	{
		
		HashSet<String> hashSet=new HashSet<String>();
		hashSet.add("Abhishek");
		hashSet.add("Manju");
		hashSet.add("Ankith");
		hashSet.add("Harshita");
		hashSet.add("shivam");
		Iterator i=hashSet.iterator();
		System.out.println("printing all the students....as hashset");
		System.out.println("----------------------------------------");
		while(i.hasNext()==true)
		{
			System.out.println(i.next());
		}
		//here im creating an object for arraylist and storing it in the List
		List<String> l=new ArrayList<String>(hashSet);
		System.out.println("printing all the students....as an Arraylist");
		System.out.println("----------------------------------------");
		System.out.println(l);
		//converting into array
		System.out.println("printing all the students....as an Array");
		System.out.println("----------------------------------------");
		Object[] o= hashSet.toArray();
		
		for (int j = 0; j < o.length; j++)
		{
		System.out.println(o[j]);	
		}
	}

}
