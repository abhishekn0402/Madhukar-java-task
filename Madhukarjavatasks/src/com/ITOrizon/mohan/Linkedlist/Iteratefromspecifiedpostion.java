//to iterate through all elements in a linked list starting at the specified position.
package com.ITOrizon.mohan.Linkedlist;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Iteratefromspecifiedpostion
{
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		LinkedList<Integer> linkedList=new LinkedList<Integer>();	
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(40);
		linkedList.add(50);
		linkedList.add(60);
        System.out.println("elements present in the linkedlist");
        System.out.println("***********************************");
		for (int i = 0; i < linkedList.size(); i++) 
		{
			System.out.println(linkedList.get(i));	
		}
		//to iterate through all elements in a linked list starting at the specified position.
		System.out.print("enter the position from where you want to iterate =");
		int position=sc.nextInt();
		ListIterator<Integer> i=linkedList.listIterator(position);
		System.out.println("after iteration the elements will be.......");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
