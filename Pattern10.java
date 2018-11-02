package com.stirred.NumPattern;

public class Pattern10 {
	//12345
	//678910
	//1112131415
	//1617181920
	//2122232425
	public static void main(String[] args) {
		int n=5;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=((count*n)+1);j<=(n*i);j++)
			{
				System.out.print(j);
				
			}			
			count++;
			System.out.println();		
			
		}
		

	}

}
