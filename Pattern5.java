package com.stirred.NumPattern;
//01010
//10101
//01010
//10101
//01010

public class Pattern5 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1; j<=5;j++)
			{
				if(((i+j)%2==1))
				{
					System.out.print(1);
				}
				else 
				{
					System.out.print(0);
				}
			}
			System.out.println();
		}


	}

}
