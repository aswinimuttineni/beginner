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
		int n,e;
		int p=1;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		e=sc.nextInt();
		if(n>=0&&e==0)
       {   
          p =1;
       }
       else if(n==0&&e>=1)
		{   
            p=0;
		} 
       else
		{ 
              for(int i=1;i<=e;i++)
	      { 
                   p=p *n;
 	 	  }    
  	    }    
 
    	  System.out.println(p);
	}
}
