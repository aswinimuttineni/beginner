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
		int rev=0;
		int count=0;
		while(n!=0)
		{
			rev=rev*10;
			rev=rev+n%10;
			n=n/10;
			count++;
		}
		while(rev>0)
		{
			int digit=rev%10;
			System.out.print(digit);
			if(count!=(count-1))
			{
				System.out.print(" ");
				rev=rev/10;
			}
		}
			
	}
}
