package com.ITOrizon.mohan.Linkedlist;

import java.util.LinkedList;

public class firstelementinlinkedlist {

	public static void main(String[] args) 
	{
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("INDIA");
		linkedList.add("USA");
		linkedList.add("Sri Lanka");
		linkedList.add("Pakistan");
		linkedList.add("ENGLAND");
		linkedList.add("France");
		System.out.println("elements present in the linked list");
		System.out.println("***********************************");
		System.out.println(linkedList);
		String lastelement=linkedList.getFirst();
		System.out.println();
		System.out.println("the retrieved element is ="+lastelement);
		
		
		

	}

}
