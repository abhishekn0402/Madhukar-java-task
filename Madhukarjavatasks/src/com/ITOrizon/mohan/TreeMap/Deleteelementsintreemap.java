//to delete all elements from a given Tree Map.
package com.ITOrizon.mohan.TreeMap;

import java.util.TreeMap;

public class Deleteelementsintreemap
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
	System.out.println("before deleting it");
	System.out.println("------------------");
	System.out.println(treeMap);
	System.out.println();
	System.out.println("after deleting it");
	System.out.println("------------------");
	treeMap.clear();
	System.out.println(treeMap);
}
}
