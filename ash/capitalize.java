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
		String str=sc.nextLine();
		StringBuilder sb = new StringBuilder();
		String words[] = str.split("\\ "); 
		for (int i = 0; i < words.length; i++)
		{			
			sb.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" ");
			
		}
		
		System.out.println(sb);
		
	}
}
