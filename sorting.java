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
		int num,temp;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int a[]=new int[num];
		for(int i=0;i<num;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<num;i++)
		{
			for(int j=i+1;j<num;j++)
			{
			  if(a[i]>a[j])
			  {
			  	temp=a[i];
			  	a[i]=a[j];
			  	a[j]=temp;
			  }
			}
		}
			for(int i=0;i<num-1;i++)
			{
				System.out.print(a[i]);
				System.out.print(" ");
				
			}
			System.out.println(a[num-1]);
		
	}
}