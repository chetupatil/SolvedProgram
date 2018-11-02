package com.stirred.NumPattern;
//11011
//11011
//00000
//11011
//11011
public class Pattern6 {

	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1; j<=n;j++)
			{
				if((i==(n+1)/2)||(j==(n+1)/2))
				{
					System.out.print(0);
				}else
				{
					System.out.print(1);
				}
			}
			System.out.println();
		}


		
	}

}
