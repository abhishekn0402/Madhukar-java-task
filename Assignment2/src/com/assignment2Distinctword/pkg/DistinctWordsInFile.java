package com.assignment2Distinctword.pkg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class DistinctWordsInFile
{
	static LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();

	public Map<String, Integer> distincWords() throws Exception
	{
		FileReader f=new FileReader("C:\\Users\\Abhilash Pramod\\Desktop\\abhishek\\itorion\\abhi.txt");
		BufferedReader br = new BufferedReader(f);
		String st = br.readLine();
		if(st != null)
		{
			st = st.replaceAll("[^a-zA-Z0-9 ]", "");    // using regular expressions.
			String[] words = st.split(" ");

			for (int i = 0; i < words.length; i++)
			{
				
				if(linkedHashMap.containsKey(words[i]))
				{
					System.out.println(linkedHashMap.get(words[i]));
					linkedHashMap.put(words[i], linkedHashMap.get(words[i])+1);
					
				} 
				else
				{
					linkedHashMap.put(words[i], 1);
				}
			}
		}
		return linkedHashMap;
	}
		public static void main(String[] args) throws Exception
		{
			DistinctWordsInFile file = new DistinctWordsInFile();
			file.distincWords();
			for (Map.Entry<String, Integer> string : linkedHashMap.entrySet())
			{
				System.out.println(string.getKey()+"\t"+string.getValue());

			}

		}
}
