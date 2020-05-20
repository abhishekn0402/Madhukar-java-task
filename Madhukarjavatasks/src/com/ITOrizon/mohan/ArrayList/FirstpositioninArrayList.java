//to insert an element into the array list at the first position.
package com.ITOrizon.mohan.ArrayList;

import java.util.ArrayList;

public class FirstpositioninArrayList
{

	public static void main(String[] args)
	{
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		//adding elements to the empty arraylist
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		System.out.println("ArrayList before adding an element");
		System.out.println("------------------------------------------");
		for (int i = 0; i < arrayList.size(); i++) 
		{
		System.out.print(arrayList.get(i)+" ");
		}
		System.out.println();
		
		
		//adding an element 1000 in the first postion of arraylist
		arrayList.add(0, 1000);
		System.out.println("ArrayList after adding an element 1000 in the first position");
		System.out.println("------------------------------------------");
		for (int i = 0; i < arrayList.size(); i++) 
		{
		System.out.print(arrayList.get(i)+" ");	
		}
		

	}

}
