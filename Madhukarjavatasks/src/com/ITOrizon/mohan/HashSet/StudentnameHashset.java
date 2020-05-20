package com.ITOrizon.mohan.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class StudentnameHashset
{

	public static void main(String[] args)
	{
		HashSet<String> hashSet=new HashSet<String>();
		hashSet.add("Abhishek");
		hashSet.add("Manju");
		hashSet.add("Ankith");
		hashSet.add("Harshita");
		hashSet.add("shivam");
		Iterator i=hashSet.iterator();
		System.out.println("printing all the students....");
		while(i.hasNext()==true)
		{
			System.out.println(i.next());
		}
		
		
		
		

	}

}
