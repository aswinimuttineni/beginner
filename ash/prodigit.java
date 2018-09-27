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
		int n,product=1;
		
		n=sc.nextInt();
		
                        while(n!=0)
                        {
                        	int k=n%10;
                        	product=product*k;
                        	n=n/10;
                        }
		System.out.print(product);
	}
}
