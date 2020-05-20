//to append the specified element to the end of a linked list.
package com.ITOrizon.mohan.Linkedlist;

import java.util.LinkedList;

public class Elementatendoflinkedlist
{

	public static void main(String[] args)
	{
		LinkedList<Integer> linkedList=new LinkedList<Integer>();	
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(40);
		linkedList.add(50);
		linkedList.add(60);
		//appending an element at the end of linkedlist
		linkedList.addLast(100);
        System.out.println("elements present in the linkedlist");
        System.out.println("***********************************");
		for (int i = 0; i < linkedList.size(); i++) 
		{
			System.out.println(linkedList.get(i));	
		}
		System.out.println("added element is = 100");
	}

}
