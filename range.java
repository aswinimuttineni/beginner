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
		boolean flag=true;
		for(int i=1;i<10;i++)
		{
			if(i==n)
			{
				flag=false;
				break;
			}
		}
			if(flag==false)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
			
		
	}
}
