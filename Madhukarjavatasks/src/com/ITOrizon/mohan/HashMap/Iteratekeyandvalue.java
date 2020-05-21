//to iterate over all the entries in the HashMap.    
package com.ITOrizon.mohan.HashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Iteratekeyandvalue {

	public static void main(String[] args)
	{
		HashMap<Integer,String> h= new HashMap<Integer,String>();		
        h.put(111, "Apple");
        h.put(222, "Mango");
        h.put(333, "Banana");
        h.put(444, "jack fruit");
        //gathering all the keys
        Set<Integer> setofkeys=h.keySet();
        //iterating
        Iterator i=setofkeys.iterator();
        while(i.hasNext()==true)
        {
        	Integer keys=(Integer) i.next();
        	//geting respective value for keys
        	String value=(String)h.get(keys);
        	System.out.println("keys is " +keys+" and its respective value is "+ value);
        	System.out.println();
        }
	}
}
