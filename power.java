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
		 long num,exp,pow=1;
	
       Scanner sc=new Scanner(System.in);
       num=sc.nextLong();
	  
       exp=sc.nextLong();
 
       if(num>=0&&exp==0)
       {   
          pow =1;
       }
       else if(num==0&&exp>=1)
	{   
            pow=0;
	} 
       else
	{ 
              for(int i=1;i<=exp;i++)
	       { 
                   pow=pow *num;
 	 	}    
  	 }    
 
    	  System.out.println(pow);
 
	}
}
