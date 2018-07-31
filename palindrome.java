/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int num;
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	int n=num;
	int rev=0;
	while(n!=0)
	{
	int r=n%10;
	rev=rev*10+r;
	n=n/10;
	}
	if(num==rev)
	{
		System.out.println("yes");
		
	}
	else
	{
		System.out.println("no");
	}
	}
	
}
