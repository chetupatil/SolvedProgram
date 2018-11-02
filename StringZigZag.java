package com.interview.programList;

public class StringZigZag {
	
	public String ZigZag(String str, int a)
	{
		String strResult = "";
		char[] c = str.toCharArray();
		int i=0;
		int count=0;
		int temp=0;
		while(i<c.length)
		{
			strResult+=c[i];
			i=i+a;
			count++;
			
			if(i==c.length+temp){
				
				i=i-count-(a-temp);
				temp++;
				count = 0;
			}
		}
		
		
		return strResult;
		
	}

	public static void main(String[] args) {
		String str = "abcdef";
		StringZigZag zz  = new StringZigZag();
		String result = zz.ZigZag(str, 3);
		System.out.println("String ZigZag :" +result);
		

	}

}
