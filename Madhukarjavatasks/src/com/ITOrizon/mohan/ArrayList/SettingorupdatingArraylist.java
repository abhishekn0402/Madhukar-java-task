package com.ITOrizon.mohan.ArrayList;

import java.util.ArrayList;

public class SettingorupdatingArraylist 
{

	public static void main(String[] args) 
	{
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("c programming");
		arrayList.add("c++");
		arrayList.add("c#");
		arrayList.add("java");
		arrayList.add("HTML");
		System.out.println("elements present in the arralist");
		System.out.println("------------------------------------------");
		for (int i = 0; i < arrayList.size(); i++) 
		{
			System.out.println(arrayList.get(i)+" ");
		}
		System.out.println();
		System.out.println("updating an element PYTHON in place of HTML");
		System.out.println("------------------------------------------");
		arrayList.set(4, "PYTHON");
		System.out.println("***AFTER UPDATING***");
		for (int i = 0; i < arrayList.size(); i++) 
		{
			System.out.println(arrayList.get(i)+" ");
		}
	}
}
