//using comparable interface and comapareto()
//if it is comparable then natural deafault sorting
//comapreTo(Object obj--2)
package com.ITOrizon.mohan.TreeSet;
import java.util.Iterator;
import java.util.TreeSet;

class Student implements Comparable
{
	int id;
	String sname;
	String city;
	public Student(int id, String sname, String city)
	{
		super();
		this.id = id;
		this.sname = sname;
		this.city = city;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", city=" + city + "]";
	}



	@Override
	public int compareTo(Object obj2)
	{
		int sid1=this.id;
		Student s2=(Student)obj2;
		int sid2=s2.id;
		if(sid1<sid2)
		{
			return -1;
		}
		else if(sid1>sid2)
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
public class Addstudentstotreeset
{
	public static void main(String[] args)
	{

		Student student1=new Student(30,"Abhishek","Mandya");
		Student student2=new Student(20,"Manju","Banglore");
		Student student3=new Student(10,"Ankit","Mysore");
		Student student4=new Student(40,"Shivam","UP");
		TreeSet<Student> treeSet=new TreeSet<Student>();
		treeSet.add(student1);//obj1.comapareTo(obj2) this obj1
		treeSet.add(student2);//obj2 this will call in the compareto method as obj2
		treeSet.add(student3);
		treeSet.add(student4);

        //sorted according to the id here
		Iterator i=treeSet.iterator(); 
		while(i.hasNext()==true)
		{
			System.out.println(i.next()); }

	}
}
