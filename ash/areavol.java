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
		int l,b,h;
		Scanner sc=new Scanner(System.in);
		 l=sc.nextInt();
		 b=sc.nextInt();
		 h=sc.nextInt();
		int area=2*(l*b+b*h+l*h);
		System.out.print(area);
		System.out.print(" ");
		int volume=l*b*h;
		System.out.print(volume);
		
	}
}
