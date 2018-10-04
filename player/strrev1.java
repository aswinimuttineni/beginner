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
				Scanner sc=new Scanner(System.in);
				String str=sc.next();
				int len=str.length();
				String rev="";
				for(int i=len-1;i>=0;i--)
				{
					 rev=rev+str.charAt(i);
				}
				System.out.print(rev);
	}
}
