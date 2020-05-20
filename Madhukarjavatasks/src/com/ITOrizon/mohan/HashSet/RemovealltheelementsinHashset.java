package com.ITOrizon.mohan.HashSet;

import java.util.HashSet;

public class RemovealltheelementsinHashset
{

	public static void main(String[] args)
	{
		HashSet<String> hashSet1 = new HashSet<String>();
        //add elements to HashSet
        hashSet1.add("Jay");
        hashSet1.add("Kondaiah");
        hashSet1.add("Madhukar");
        hashSet1.add("Abhilash");
        hashSet1.add("Abhishek");
        System.out.println("elements in first hashset");
        System.out.println("========================");
        System.out.println(hashSet1);
        System.out.println();
        System.out.println("AFTER CLEARING IT WILL BE LIKE THIS");
        System.out.println("===================================");
        hashSet1.clear();
        System.out.println(hashSet1);

	}

}
