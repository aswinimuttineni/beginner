
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
		int n,rem=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>1)
		{
			if(n%2==0)
			{
				rem=n/2;
			}
			else
			{
				break;
			}
			n=n/2;
		}
		if(rem>0)
		{
			System.out.println(rem);
		}
		else
		{
			System.out.println(n);
		}
	}
}
