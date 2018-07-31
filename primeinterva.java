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
		int n,m;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		n=n+1;
		while(n<m)
		{
			boolean flag=false;
			for(int i=2;i<=(n/2);i++)
			{
				if(n%i==0)
				{
					flag=true;
					break;
				}
			}
			if(!flag)
			{
				System.out.print(n);
			        ++n;
			}
		}
			
		
	}
}
