package com.stirred.NumPattern;
//01110
//10001
//10001
//10001
//01110

public class Pattern8 {

	public static void main(String[] args) 
	{
		int n=5;
	for(int i=0; i<n; i++)
	{
		for(int j=0; j<n; j++)
		{
			if((i==0||i==n-1)&&(j==0||j==n-1))
			{
				System.out.print(0);
			}else if(i==0||i==n-1||j==0||j==n-1)
			{
				System.out.print(1);
			}else
			{
				System.out.print(0);
			}
		}
		System.out.println();
	}

	}

}
