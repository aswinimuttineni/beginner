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
		int hr,min;
		int hr1,min1;
		int hr2,min2;
		hr=sc.nextInt();
		min=sc.nextInt();
		hr1=sc.nextInt();
		min1=sc.nextInt();
		if(hr1>hr)
		{
			hr2=hr1-hr;
		}
		else
		{
			hr2=hr-hr1;
		}
		if(min1>min)
		{
			min2=min1-min;
		}
		else
		{
			min2=min-min1;
		}
		System.out.println(hr2+" "+min2);
	}
}
