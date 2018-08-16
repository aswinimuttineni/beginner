/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String str;
		
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		int k=0;
		int l=0;
		int len=str.length();
		for(int i=0;i<len;i++)
		{
		if(str.charAt(i)=='0'||str.charAt(i)=='1')
		{
		++k;
		}
		else
		{
			l=2;
			
		}
		}
		if(l==2)
		{
			System.out.println("no");
		}
		else
		{
		System.out.println("yes");
		}
		
		
	}
}
