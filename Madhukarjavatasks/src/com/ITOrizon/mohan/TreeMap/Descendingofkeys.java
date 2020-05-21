package com.ITOrizon.mohan.TreeMap;

import java.util.TreeMap;

public class Descendingofkeys
{

	public static void main(String[] args)
	{
		TreeMap<Integer,String> treeMap=new TreeMap<Integer,String>();
		//adding student id and student name into treemap and it will give us natural sorting
		treeMap.put(111, "JAVA");
		treeMap.put(777, "PYTHON");
		treeMap.put(888, "DEVOPS");
		treeMap.put(555, "C#");
		treeMap.put(222, "LINUX");
		System.out.println("ascending order");
		System.out.println("========================");
		System.out.println(treeMap);//natural sorting
		System.out.println();
		System.out.println("descending order");
		System.out.println("========================");
		System.out.println(treeMap.descendingMap());//natural sorting
	}
}
