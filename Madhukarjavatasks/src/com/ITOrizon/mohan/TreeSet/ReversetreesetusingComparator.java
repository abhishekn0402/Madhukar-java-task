//sorted based on km by using comparator and compare method
//customized sorting
package com.ITOrizon.mohan.TreeSet;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Zomatto
{
	String order;
	double amount;
	long id;
	String distance;
	public Zomatto(String order, double amount, long id, String distance) {
		super();
		this.order = order;
		this.amount = amount;
		this.id = id;
		this.distance = distance;
	}
	@Override
	public String toString() {
		return "Zomatto [Order=" + order + ", amount=" + amount + ", id=" + id + ", distance=" + distance + "]";
	}
}
class Mycomparator implements Comparator
{	
	@Override
	public int compare(Object o1, Object o2)
	{
		Zomatto s1=(Zomatto)o1;
		Zomatto s2=(Zomatto)o2;
		String ans1=s1.distance;
		String ans2=s2.distance;
		return ans1.compareTo(ans2);
	}

}
public class ReversetreesetusingComparator
{

	public static void main(String[] args)
	{
		Zomatto z1=new Zomatto("chicken",250.50,00001,"10km");
		Zomatto z2=new Zomatto("fish",100.00,00002,"05km");
		Zomatto z3=new Zomatto("idli vada",100.0,00003,"20km");
		Zomatto z4=new Zomatto("lemon rice",30.0,00004,"14km");
	

		TreeSet<Zomatto> t=new TreeSet<Zomatto>(new Mycomparator());
		t.add(z1);
		t.add(z2);
		t.add(z3);
		t.add(z4);
		System.out.println("sorted based on the km");
		System.out.println("---------------------------------------");
		System.out.println(t);
		Iterator i=t.iterator();
		while(i.hasNext()==true)
		{
			System.out.println(i.next());
		}
	}
}
