package com.interview.programList;

import java.util.HashMap;
import java.util.Iterator;

public class CountRepeatedChar {

	public static void main(String[] args) {
		String st = "helloworld";
		char[] c =st.toCharArray();
		int count=0;
		 HashMap<String, Integer> map = new HashMap<>(); 
		for(int i=0;i<c.length;i++){
			for(int j=0;(j)<c.length;j++)
			{
				if(c[i]==c[j])
				{
					count++;
				}
				
			}
			
			map.put(c[i]+"", count);
			count=0;
		}
		Iterator entries = map. entrySet(). iterator();
		while(entries.hasNext())
		{
			System.out.println(entries.next());
		}
			
	}

}
