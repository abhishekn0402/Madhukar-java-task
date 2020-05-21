//to get the number of elements in a tree set.
package com.ITOrizon.mohan.TreeSet;
import java.util.TreeSet;
public class GetelementsTreeset
{
	public static void main(String[] args)
	{
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(10);
		t.add(20);
		t.add(30);
		t.add(40);
		int a=t.size();
        System.out.println("number of elements present in the treeset ="+ a);      
	}
}
