//to create a TreeMap of <studentId(Integer), studentName(String)>.
//Add some student reocrds with random student ids. 
package com.ITOrizon.mohan.TreeMap;

import java.util.TreeMap;

public class StudentTreeMap
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
		System.out.println(treeMap);
		//we will get natural soring
	}
}
