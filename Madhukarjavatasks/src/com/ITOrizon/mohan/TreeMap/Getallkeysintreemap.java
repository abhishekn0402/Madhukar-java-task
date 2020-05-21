package com.ITOrizon.mohan.TreeMap;

import java.util.Set;
import java.util.TreeMap;

public class Getallkeysintreemap
{

	public static void main(String[] args)
	{
		TreeMap<Integer,String> treeMap=new TreeMap<Integer,String>();
		//adding student id and student name into treemap and it will give us natural sorting
		treeMap.put(10, "Abhishek");
		treeMap.put(20, "Manju");
		treeMap.put(50, "Harshitha");
		treeMap.put(90, "Shivam");
		treeMap.put(24, "Ankith");
		//need to get all key so we need use keyset()
		Set<Integer> setofkeys=treeMap.keySet();
		//it means for each keys in setofkeys print each key
		for (Integer keys : setofkeys)
		{
		System.out.println(keys);	
		}

	}

}
