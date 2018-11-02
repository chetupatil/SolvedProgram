package com.interview.programList;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordCheck
{
   public String ValidCheck(String str)
   {
	   System.out.println(str);
	  // char[] c = str.toCharArray();

       Pattern letter = Pattern.compile("[a-zA-z]");
       Pattern digit = Pattern.compile("[0-9]");
       Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
	   Matcher m = letter.matcher(str);
	   Matcher m1 = digit.matcher(str);
	   Matcher m2 = special.matcher(str);
	   if(m.find()==true&&m1.find()==true&&m2.find()==true){
		  // System.out.println("hello");
		   return "true";
	   }
	  
	   return "false";
   }
	public static void main(String[] args)
	{
		PasswordCheck pc = new PasswordCheck();
		Scanner scn = new Scanner(System.in);
		System.out.println("Check the password is valid or not");
		String str = scn.nextLine();
		String a = pc.ValidCheck(str);
		if(a.equals("true"))
		{
			System.out.println("valid password");
		}else
		{
			System.out.println("invalid password");
		}
		

	}

}
