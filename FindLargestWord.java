package com.interview.programList;

import java.util.Scanner;

public class FindLargestWord {
	
	public String findWordLargest(String str)
	{
		int temp =0;
		//System.out.println(str);
		String[] st = str.split(" ");
		for(int i=0;i<st.length;i++)
		{
			//System.out.println(st[i]);
			char[] c =st[i].toCharArray();
			int firstLength = c.length;
			System.out.println("first length"+firstLength);
			for(int j=1;j<st.length;j++)
			{
				char[] c1 = st[j].toCharArray();
				int secondLength = c1.length;
				System.out.println("second length "+secondLength);
			if(firstLength>=secondLength)
			{
				System.out.println(c.length);
				temp = firstLength;
				firstLength = secondLength;
				secondLength = temp;
				System.out.println("Heighest value:"+st[i]);
				
			}
			
			}
		}
		
		return str;
		
	}

	public static void main(String[] args) {
		
		FindLargestWord flw = new FindLargestWord();
		System.out.println("write a statements");
		Scanner scn = new Scanner(System.in);
		String st = scn.nextLine();
		flw.findWordLargest(st);
		

	}

}
