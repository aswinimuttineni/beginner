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
		int res=0;
		int temp=n;
		while(n>0)
		{
			int a=n%10;
			res=res+a*a*a;
			n=n/10;
		}
		if(temp==res)
		
			System.out.println("yes");
		else
		System.out.println("no");
	}
}
