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
		int len=str.length();
		int k=0;
		for(int i=0;i<len;i++)
		{
		if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='e'||str.charAt(i)=='I'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='U'||str.charAt(i)=='u')
		{
			 k=1;
		}
		}
		if(k==1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}
}
