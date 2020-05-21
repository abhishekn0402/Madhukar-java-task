package com.ITOrizon.mohan.TreeSet;

import java.util.TreeSet;

public class Retriveandremovelastelement
{

	public static void main(String[] args)
	{
		TreeSet<Integer> t1=new TreeSet<Integer>();
		t1.add(10);
		t1.add(20);
		t1.add(30);
		t1.add(40);
		t1.add(50);
		System.out.println("elements before remove");
		System.out.println("=========================");
		System.out.println(t1);
		System.out.println("element to remove(last element)");
		System.out.println("================================");
		int z=t1.pollLast();
		System.out.println(z);
		System.out.println("after removing last element");
		System.out.println("================================");
		System.out.println(t1);
	
	}

}
