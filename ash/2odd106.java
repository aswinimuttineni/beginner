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
		int m,n,k=0,l=0;
		m=sc.nextInt();
		n=sc.nextInt();
		int[] a=new int[10];
		for(int j=0;j<m;j++)
		{
			a[j]=sc.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			if((a[i]%2)==0)
			{
				
			}
			else
			{
				k=a[i];
				l++;
				if(l==n)
				{
					System.out.print(k);
				}
			}
		}
	}
}
