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
			int n,m;
	    	Scanner sc=new Scanner(System.in);
	     	n=sc.nextInt();
	     	m=sc.nextInt();
	     	int a=n*m;
	     	int sqrt=(int)Math.sqrt(a);
	     	if(sqrt*sqrt==a)
	     	{
	     		System.out.println("yes");
	     	}
	     	else
	     	{
	     			System.out.println("no");
	     	}
	
	}
}
