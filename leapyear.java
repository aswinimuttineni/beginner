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
			int year;
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		if(year%400==0)
		{
			System.out.println("Yes");
		}
		
		else if(year%100==0)
		{
			System.out.println(" No");
		}
		else if((year%4==0))
		{
			System.out.println("yes");
		}
		
		else 
		{
			System.out.println("No");
		}
	}
}
