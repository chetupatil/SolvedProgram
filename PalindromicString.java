package com.interview.programList;

import java.util.Scanner;

public class PalindromicString {
	
	public String palindromic(String str)
	{
		String reverseString ="";
		String finalString ="";
		char[] c = str.toCharArray();
		for(int i=c.length-1;i>=0;i--){
		//System.out.println(c[i]);
		reverseString+=c[i];
		}
		System.out.println("str : "+str);
		System.out.println("reverse String : "+reverseString);
		char[] cr = reverseString.toCharArray();
		for(int i=0;i<cr.length;i++)
		{
//			System.out.print(c[i]+" :");
//			System.out.print(cr[i]+", ");
		if(c[i]==cr[i])
		{
			finalString+=c[i];
		}
		}
		return finalString;
		
	}
	

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		PalindromicString ps = new PalindromicString();
		System.out.println("palindromic string");
		String st = scn.nextLine();
		String a =ps.palindromic(st);
		System.out.println(" final result: "+a);
		/*boolean result = ps.palindromic(st);
		if(result==true)
		{
			System.out.println("String is Palindromic");
		}else
		{
			System.out.println("String is not Palindromic");
		}
*/		
	}

}
