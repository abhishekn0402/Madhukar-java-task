//to test if a map contains a mapping for the specified value.
package com.ITOrizon.mohan.HashMap;
import java.util.HashMap;
import java.util.Scanner;

public class CheckMapcontainMapping
{
    public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		HashMap<String,String> h= new HashMap<String,String>();		
        h.put("Karnataka", "Banglore");
        h.put("Tamil Nadu", "Chennai");
        h.put("Kerala", "Tiruvanantapur");
        h.put("Andra", "Hyderbad");
        //to check whether the mapping present in the map
        System.out.print("Please enter your value = ");
        //taking user input
        String value=sc.nextLine();
        boolean b=h.containsValue(value);
        if(b)
        {
        	System.out.println("the mapping is present");
        }
        else
        {
        	System.out.println("sorry the mapping is not present");
        }

	}

}
