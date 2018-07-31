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
		int low=sc.nextInt();
		int high=sc.nextInt();
		for(int number=low+1;number<high;++number)
		{
			if(checkArmstrong(number))
			System.out.print(number);
		}
	}
	public static boolean checkArmstrong(int num)
	{
		int digits=0;
		int result=0;
		int originalNumber=num;
		originalNumber=num;
		while(originalNumber!=0)
		{
			int rem=originalNumber%10;
			result+=rem*rem*rem;
			originalNumber/=10;
		}
		if(result==num)
		  return true;
		
		return false;
		
	}
}
