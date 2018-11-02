package com.interview.programList;

public class seprationOfOddAndEven
{

	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5,6};
		int[] b = new int[a.length/2];
		int[] c = new int[a.length/2];
		int j=0;
		int l=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				b[j]=a[i];
				
			//	System.out.print(a[i]+" ");
				j++;
			}else
			{
				c[l]=a[i];
				l++;
			}
			
			
		}
		for(int k=0;k<b.length;k++)
		{
			System.out.print(b[k]+"->");
		}
		
		for(int k=0;k<c.length;k++)
		{
			System.out.print(c[k]+"->");
		}
		System.out.println();

	}

}
