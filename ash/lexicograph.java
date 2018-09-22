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
		        String str=sc.next();
		        char[] arr=str.toCharArray();
		        
				int i=0,j=0;
				char temp;
				
        for(i=0;i<arr.length;i++) {
            for (j=i+1;j<arr.length;j++) {
                if (arr[i]>arr[j])
                {
                     temp = arr[i];
                    arr[i] =arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr);

	}
}
