package com.ITOrizon.mohan.HashMap;

import java.util.HashMap;

public class Sizeofkeyvalue
{

	public static void main(String[] args)
	{
		HashMap<String,String> h= new HashMap<String,String>();		
        h.put("RCB", "Virat kohli");
        h.put("CSK", "MS Dhoni");
        h.put("MI", "Rohit Sharma");
        h.put("SRH", "David Warner");
        int length=h.size();
        System.out.println("Length of the hashmap or number of key-value in hashmap = "+length);
	}
}
