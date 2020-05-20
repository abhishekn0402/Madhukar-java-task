//to iterate a linked list in reverse order.
package com.ITOrizon.mohan.Linkedlist;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Iteratelinkedlistreverseorder
{
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		LinkedList<String> linkedList=new LinkedList<String>();	
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		linkedList.add("D");
		linkedList.add("E");
		linkedList.add("F");
		
		
        System.out.println("elements present in the linkedlist");
        System.out.println("***********************************");
		for (int i = 0; i < linkedList.size(); i++) 
		{
			System.out.println(linkedList.get(i));	
		}
		//to iterate a linked list in reverse order.
		System.out.println("printing in reverse order");
		System.out.println("***************************");
		Iterator<String>i=linkedList.descendingIterator();
		while(i.hasNext()==true)
		{
			System.out.println(i.next());
		}
	}

}
