package com.ITOrizon.mohan.HashSet;

import java.util.HashSet;

public class ComparetwoHashset {

	public static void main(String[] args)
	{
		HashSet<Integer> hashSet1=new HashSet<Integer>();	
		hashSet1.add(10);
		hashSet1.add(20);
		hashSet1.add(30);
		hashSet1.add(40);
		HashSet<Integer> hashset2=new HashSet<Integer>();	
		hashset2.add(10);
		hashset2.add(20);
		hashset2.add(30);
		hashset2.add(40);
		System.out.println(hashSet1.equals(hashset2));
	}

}
