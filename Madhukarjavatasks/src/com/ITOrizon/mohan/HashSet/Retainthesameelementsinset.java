package com.ITOrizon.mohan.HashSet;

import java.util.HashSet;

public class Retainthesameelementsinset
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
        HashSet<String> hashSet2 = new HashSet<String>();
        hashSet2.add("Jay");
        hashSet2.add("Kondaiah");
        hashSet2.add("Madhukar");
        hashSet2.add("Mohan");
        System.out.println("elements in second hashset");
        System.out.println("========================");
        System.out.println(hashSet2);
        System.out.println();
        hashSet1.retainAll(hashSet2);
        System.out.println("elements in the first hashset after retaining");
        System.out.println("========================");
        System.out.println(hashSet1);

	}

}
