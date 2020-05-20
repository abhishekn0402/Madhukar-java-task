//to search an element in a array list.
package com.ITOrizon.mohan.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class Searchanelementinarraylist 
{
	 
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("BMW");
		arrayList.add("AUDI");
		arrayList.add("Benz");
		arrayList.add("Ferrari");
		arrayList.add("jaguar");
		System.out.println("elements present in the arralist");
		System.out.println("------------------------------------------");
		for (int i = 0; i < arrayList.size(); i++) 
		{
			System.out.println(arrayList.get(i)+" ");
		}
		System.out.println("*****************************");
		//search an element in a array list using contain method.
		//if the element is present in the arraylist return true else false
		System.out.print("please enter your element to check =");
		String element=sc.nextLine();
		boolean b=arrayList.contains(element.toUpperCase());
		if (b) 
		{
		System.out.println("arraylist contain this element");	
		}
		else
		System.out.println("arraylist not contain this element");	
		sc.close();
	}
}
