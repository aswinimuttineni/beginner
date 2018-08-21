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
		int count=0;
		int mul=1;
		while(n!=0)
		{
			n=n/2;
			count++;
		}
		for(int i=0;i<count;i++)
		{
			mul=2*mul;
		
		}
			System.out.println(mul);
	}
}
