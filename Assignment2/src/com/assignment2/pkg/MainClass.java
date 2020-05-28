package com.assignment2.pkg;

import java.util.Map;
import java.util.TreeMap;

public class MainClass
{
	static TreeMap<StudentId, StudentDetail> lhm = new TreeMap<StudentId, StudentDetail>(new SortByYear());
	public static TreeMap<StudentId, StudentDetail> studentDetails() {
		
		StudentId student1 = new StudentId("MECH1", 4, 101);
		StudentId student2 = new StudentId("CSE1", 3, 102);
		StudentId student3 = new StudentId("MECH3", 2, 104);
		StudentId student4 = new StudentId("ECE4", 4, 105);
		StudentId student5 = new StudentId("EEE2", 2, 106);
		StudentId student6 = new StudentId("CSE1", 1, 107);
		StudentId student7 = new StudentId("MECH3", 3, 108);
		StudentId student8 = new StudentId("ECE4", 3, 109);
		StudentId student9 = new StudentId("IT5", 2, 110);
		StudentId student10 = new StudentId("CSE1", 2, 111);
		
		StudentDetail details1 = new StudentDetail(student1, "Abhishek", "Madival", 22, "Mech", "BTech");
		StudentDetail details2 = new StudentDetail(student2, "Madhu", "Eregowda", 22, "CSE", "BTech");
		StudentDetail details3 = new StudentDetail(student3, "Nagaraju", "Bettaiah", 22, "MECH", "BTech");
		StudentDetail details4 = new StudentDetail(student4, "Prem", "Sundar", 22, "ECE", "BTech");
		StudentDetail details5 = new StudentDetail(student5, "Ashish", "Nayar", 22, "EEE", "BTech");
		StudentDetail details6 = new StudentDetail(student6, "Kiran", "Gowda", 22, "CSE", "BTech");
		StudentDetail details7 = new StudentDetail(student7, "Manikanta", "Rajan", 22, "MECH", "BTech");
		StudentDetail details8 = new StudentDetail(student8, "Praneeth", "gowda", 22, "ECE", "BTech");
		StudentDetail details9 = new StudentDetail(student9, "Pavan", "gowda", 22, "IT", "BTech");
		StudentDetail details10 = new StudentDetail(student10, "Prasad", "gowda", 22, "CSE", "BTech");
		
		lhm.put(student1, details1);
		lhm.put(student2, details2);
		lhm.put(student3, details3);
		lhm.put(student4, details4);
		lhm.put(student5, details5);
		lhm.put(student6, details6);
		lhm.put(student7, details7);
		lhm.put(student8, details8);
		lhm.put(student9, details9);
		lhm.put(student10, details10);
		return lhm;
	}

	public static void main(String[] args)
	{
		MainClass.studentDetails();
		for (Map.Entry<StudentId, StudentDetail> lm : lhm.entrySet())
		{
			System.out.println(lm.getKey()+" : "+lm.getValue());
			System.out.println();
		}
	}
}

