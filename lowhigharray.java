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
		int n,max,min;
		Scanner sc=new Scanner(System.in);
		int[] a=new int[10];
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		min=a[0];
		for(int i=0;i<n;i++)
		{
			
			if(min>a[i])
			{
				min=a[i];
			}
			
			
		}
		max=a[0];
		for(int i=0;i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			
		}
		System.out.println(min+" "+max);
	}
}
