import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String s;
		int a=0;
		

		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		
		for(int i=0;i<s.length();++i)
		{
		if(s.charAt(i)==' ')
		{
		continue;
		}
		
		
		a++;
		}
		System.out.println(a);
	}

}
