package com.ITOrizon.mohan.HashMap;

import java.util.HashMap;

public class GetvaluebyKey
{

	public static void main(String[] args)
	{
		HashMap<Integer,String> h= new HashMap<Integer,String>();		
        h.put(10, "Abhi");
        h.put(11, "Arun");
        h.put(12, "Abhilash");
        h.put(13, "Jyothi");
        System.out.println("elements in key value format");
        System.out.println("==============================");
        System.out.println(h);
        System.out.println();
        System.out.println("value in key is");
        System.out.println("==============================");
        int key=10;
        System.out.print("key is = ");
        System.out.println(key);
        if(h.containsKey(key)==true)
        {        
        	System.out.println("value is = "+h.get(key));
        }

	}

}
