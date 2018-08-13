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
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int n1=1,n2=1,n3;
		if(n==1)
		{
			System.out.print(n1);
		}
		else
		{
			System.out.print(n1+" "+n2);
		
		for(int i=1;i<n-1;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		}
	
	}
}
