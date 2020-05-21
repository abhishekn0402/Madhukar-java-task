package com.ITOrizon.mohan.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

class Employee implements Comparable
{
	int eid;
	String ename;
	String company;
	public Employee(int eid, String ename, String company)
	{
		super();
		this.eid = eid;
		this.ename = ename;
		this.company = company;
	}
	@Override
	public String toString()
	{
		return "Employee [eid=" + eid + ", ename=" + ename + ", company=" + company + "]";
	}
	@Override
	public int compareTo(Object obj2)
	{
		
		int eid1=this.eid;
		Employee s2=(Employee)obj2;
		int eid2=s2.eid;
		if(eid1>eid2)
		{
			return -1;
		}
		else if(eid1<eid2)
		{
			return 1;
		}
		else
		{
			// TODO Auto-generated method stub
			return 0;
		}
	}
	
}
public class Reversethetreeset
{
	public static void main(String[] args)
	{
		Employee employee1=new Employee(100,"Abhishek","ITO");
		Employee employee2=new Employee(111,"Manju","ITO");
		Employee employee3=new Employee(101,"Ankith","ITO");
		Employee employee4=new Employee(103,"Harhshita","ITO");
		TreeSet<Employee> t=new TreeSet<Employee>();//default natural sorting because no argument constrctor
		t.add(employee1);
		t.add(employee2);
		t.add(employee3);
		t.add(employee4);
		Iterator i=t.iterator();
		while(i.hasNext()==true)
		{
			System.out.println(i.next());
		}
		

	}

}
