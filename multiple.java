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
		int num,res;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(int i=1;i<=5;i++)
		{
			res=i*num;
			if(i<num){
			System.out.print(res);
			System.out.print(" ");
			}
			else{
				System.out.print(res);
			}
		
		}
		
	}
}
