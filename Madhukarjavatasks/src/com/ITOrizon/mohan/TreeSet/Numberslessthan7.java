package com.ITOrizon.mohan.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Numberslessthan7
{

	public static void main(String[] args)
	{
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(1);
		t.add(2);
		t.add(30);
		t.add(40);
		t.add(7);
		TreeSet<Integer> t2=new TreeSet<Integer>();
		t2=(TreeSet)t.headSet(7);
		Iterator i=t2.iterator();
		System.out.println("numbers less than 7");
		System.out.println("====================");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
