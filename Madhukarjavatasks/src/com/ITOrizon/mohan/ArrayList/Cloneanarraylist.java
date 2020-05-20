package com.ITOrizon.mohan.ArrayList;

import java.util.ArrayList;

public class Cloneanarraylist 
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
		//creating an one more arraylist
		ArrayList<Integer> arrayListclone=new ArrayList<Integer>();
		arrayListclone=(ArrayList<Integer>) arrayList.clone();
		System.out.println("CLONED ARRAYLIST");
		System.out.println("------------------------------------------");
		for (int i = 0; i < arrayListclone.size(); i++) 
		{
		System.out.print(arrayListclone.get(i)+" ");
		}
		
		
		
	}

}
