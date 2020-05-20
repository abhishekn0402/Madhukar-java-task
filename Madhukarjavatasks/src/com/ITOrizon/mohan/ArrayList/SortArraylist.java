package com.ITOrizon.mohan.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
//to sort a given array list.
public class SortArraylist
{
	public static void main(String[] args)
	{
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		//adding elements to the empty arraylist
		arrayList.add(7);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(1);
		arrayList.add(5);
		arrayList.add(4);
		arrayList.add(6);
		System.out.println("elements present in the arralist");
		System.out.println("------------------------------------------");
		for (int i = 0; i < arrayList.size(); i++) 
		{
			System.out.print(arrayList.get(i)+" ");
		}	
		System.out.println();
		System.out.println("after sorting the elements arraylist will be in the sorted order"); 
		System.out.println("------------------------------------------");
		//sort method pressent in the Collections class
		Collections.sort(arrayList);
		for (int i = 0; i < arrayList.size(); i++) 
		{
			System.out.print(arrayList.get(i)+" ");
		}
	}

}
