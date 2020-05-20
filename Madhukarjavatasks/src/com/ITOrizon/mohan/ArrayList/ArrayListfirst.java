//to create a new array list containing student names, add some student (string)
//and print out the collection.
package com.ITOrizon.mohan.ArrayList;
import java.util.ArrayList;
public class ArrayListfirst
{
	public static void main(String[] args) 
	{
		ArrayList<String> arrayList=new ArrayList<String>();
		//adding students to ArrayList
		arrayList.add("Abhishek");
		arrayList.add("Manju");
		arrayList.add("Hussain");
		arrayList.add("Ankith");
		arrayList.add("Harshitha");
		arrayList.add("Shivam");
		//printing all the students present in the arraylist
		System.out.println("students present in the arraylist");
		System.out.println("---------------------------------");
		int n=1;
		for (int i = 0; i < arrayList.size(); i++) 
		{
		System.out.println(n+" . "+arrayList.get(i));
		n++;
		}
	}
}
