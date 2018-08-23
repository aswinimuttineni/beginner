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
		int a=0,rem=0,k=0,count=0;
		while(n!=0)
		{
			a=n%10;
			if(a%2!=0)
			{
				count++;
			}
			rem=rem*10+a;
			n=n/10;
		}
		int l=count-1;
		int j=count-l;
		while(rem!=0)
		{
			k=rem%10;
			if(k%2!=0)
			{
				System.out.print(k);
				if(count!=j)
				{
					System.out.print(" ");
					count--;
				}
			}
		
			rem=rem/10;
		
		}
		
		
	}
}
