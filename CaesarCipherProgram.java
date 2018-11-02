package com.interview.programList;

public class CaesarCipherProgram {
	
	public String CaesarCipher(String str,int num)
	{
		String finalResult = "";
		char[] c = str.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			int a = c[i]+num;
			char c1 =(char) a;
			finalResult = finalResult+c1;
			
		}
		return finalResult;
	}

	public static void main(String[] args) {
		
		CaesarCipherProgram c = new CaesarCipherProgram();
		String CaesarCipherResult= c.CaesarCipher("Hello", 4);
		System.out.println("Output List : "+CaesarCipherResult);

	}

}
