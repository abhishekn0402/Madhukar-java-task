package com.ITOrizon.mohan.TreeMap;

import java.util.Comparator;
import java.util.TreeMap;
class Mycomaparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2)
	{
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		
		return i1.compareTo(i2);
	}
	
}
public class Sortingusingcomparator
{

	public static void main(String[] args)
	{
		TreeMap<Integer,String> treeMap=new TreeMap<Integer,String>(new Mycomaparator());
		//adding student id and student name into treemap and it will give us natural sorting
		treeMap.put(10, "Abhishek");
		treeMap.put(20, "Manju");
		treeMap.put(50, "Harshitha");
		treeMap.put(90, "Shivam");
		treeMap.put(24, "Ankith");
		System.out.println("customized sorting using comparator");
		System.out.println("---------------------------------------------------------------------");
		System.out.println(treeMap);

	}

}
