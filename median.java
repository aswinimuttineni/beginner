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
		int num,temp,med=0;
		int[] a=new int[10];
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			a[i]=sc.nextInt();
		}
		temp=0;
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
		if(num%2==0)
		{
			med=(a[num/2]+a[(num/2)+1])/2;
			
			System.out.println(med);
		}
		else
		{
			med=a[num/2];
			System.out.println(med);
		}
	
	

	}
}
