//to remove all of the mappings from a map.
package com.ITOrizon.mohan.HashMap;

import java.util.HashMap;

public class RemoveMappingfrommap
{
	public static void main(String[] args)
	{
		HashMap<String,String> h= new HashMap<String,String>();		
        h.put("RCB", "Virat kohli");
        h.put("CSK", "MS Dhoni");
        h.put("MI", "Rohit Sharma");
        h.put("SRH", "David Warner");
        System.out.println("before clearing");
        System.out.println("------------------");
        System.out.println(h);
        System.out.println();
        System.out.println("after clearing");
        System.out.println("------------------");
        //here im clearing using clear method present hashmap
        h.clear();
        System.out.println(h);

	}

}
