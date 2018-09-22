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
		long n1,n2;
		
		Scanner sc=new Scanner(System.in);
		n1=sc.nextLong();
		
		char op=sc.next().charAt(0);
		n2=sc.nextLong();
		if(op=='%')
		{
			System.out.print(n1%n2);
		}
		else
		{
			System.out.print(n1/n2);
		}
		
		
	}
}
