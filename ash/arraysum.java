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
		int n,sum=0,i=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] a=new int[10];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
		sum=sum+a[i];
		}
		System.out.println(sum);
	}
}
