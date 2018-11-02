package com.interview.programList;

public class FlattenAList 
{
	public String flattens(String inputList)
	{
		char[] c = inputList.toCharArray();
		String flattensResult = "";
		flattensResult+="[";
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=']' && c[i]!='[' && c[i]!=',')
			{
			flattensResult+=c[i]+" ";
			}
		}
		
		flattensResult+="]";
		
		return flattensResult;
	}

	public static void main(String[] args) 
	{
	FlattenAList fal = new FlattenAList();
	String inputList	= "[[1],2,[[3,4],5],[[[]]],[[6]],7,8,[]]";
	String outputResult = fal.flattens(inputList);
	System.out.println("Output List :"+outputResult);
	
		
	

	}

}
