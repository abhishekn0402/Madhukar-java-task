//to insert the specified element at the specified position in the linked list.
package com.ITOrizon.mohan.Linkedlist;
import java.util.LinkedList;
import java.util.Scanner;
public class Specifiedelementatspecifiedpostion {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("RCB");
		linkedList.add("CSK");
		linkedList.add("MI");
		linkedList.add("DD");
		linkedList.add("KKR");
		linkedList.add("SRH");
		linkedList.remove("KKR");

		System.out.println("elements present in the linkedlist");
		System.out.println("***********************************");
		/*
		 * for (int i = 0; i < linkedList.size(); i++) {
		 * System.out.println(linkedList.get(i)); }
		 */
		System.out.println(linkedList);
		System.out.print("Enter at which postion you want to add an element = ");
		int position = sc.nextInt();
		String element ="KKR";

		linkedList.add(position, element);

		System.out.println("After adding");
		System.out.println("************");
		System.out.println(linkedList);


	}

}
