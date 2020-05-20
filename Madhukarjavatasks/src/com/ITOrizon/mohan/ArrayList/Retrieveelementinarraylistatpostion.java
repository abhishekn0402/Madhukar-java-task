//to retrieve an element (at a specified index) from a given array list.
package com.ITOrizon.mohan.ArrayList;
import java.util.ArrayList;
public class Retrieveelementinarraylistatpostion 
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
		System.out.println("elements present in the arralist");
		System.out.println("------------------------------------------");
		for (int i = 0; i < arrayList.size(); i++) 
		{
		System.out.print(arrayList.get(i)+" ");
		}
		System.out.println();
		//retrieve an element (at a specified index) from a given array list(index 3).
		System.out.println("element retrived is at index 3 is = "+arrayList.get(3));
		
	}

}
