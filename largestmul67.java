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
		int m;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=n+10;
		for(int i=n;i<m;i++)
		{
			if(i%10==0)
			{
				System.out.println(i);
			}
		}
	}
}