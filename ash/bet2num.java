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
		int l,m;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		l=sc.nextInt();
		m=sc.nextInt();
		if(n>l&&n<m)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}
}
