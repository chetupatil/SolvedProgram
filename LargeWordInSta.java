package com.interview.programList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LargeWordInSta {

	public static void main(String[] args) {
		int temp=0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the statements:");
		String str = scn.nextLine();
		 Map<Integer,Integer> list = new HashMap<Integer,Integer>();
		String[] st = str.split(" ");
		for(int i=0;i<st.length;i++)
		{
		char[] c =st[i].toCharArray();
		list.put(i, c.length);
		}
		for(int k=0;k<list.size();k++)
		{
				if(list.get(k)>temp){
					temp =list.get(k);
				}	
		}
		System.out.println("highest value:"+temp);
		for(int i=0;i<st.length;i++)
		{
		char[] c =st[i].toCharArray();
		if(c.length==temp){
			System.out.println("heighest length of the string:"+st[i]);
		}
		}
		System.out.println();

	}

}
