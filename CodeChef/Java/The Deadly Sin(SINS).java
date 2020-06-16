// The Deadly Sin 
// Problem Code: SINS

// Meliodas and Ban are fighting over chocolates. Meliodas has X chocolates, while Ban has Y. Whoever has lesser number of chocolates eats as many chocolates as he has from the other's collection. This eatfest war continues till either they have the same number of chocolates, or atleast one of them is left with no chocolates.
// Can you help Elizabeth predict the total no of chocolates they'll be left with at the end of their war?

// Input:
// First line will contain T, number of testcases. Then the testcases follow.
// Each testcase contains of a single line of input, which contains two integers X,Y, the no of chocolates Meliodas and Ban have, respectively.
// Output:
// For each testcase, output in a single line the no of chocolates that remain after Ban and Meliodas stop fighting.

// Constraints
// 1≤T≤100000
// 0≤X,Y≤109
// Sample Input:
// 3
// 5 3
// 10 10
// 4 8

// Sample Output:
// 2
// 20
// 8

// Solution :

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int T,X,Y;
	    Scanner sc=new Scanner(System.in);
	    T=sc.nextInt();
	    while(T--!=0)
	    {
	    X=sc.nextInt();
	    Y=sc.nextInt();
	      while(X!=Y&&X!=0&&Y!=0)
	      {
	           if(X%Y==0||Y%X==0)
	            {  if(X>Y)
                    X=Y;
                    else
                    Y=X;
	            }   
	          else 
	               {
	               if(X>Y)
                    X%=Y;
                    else
                    Y%=X;
	               }
	     }
	      System.out.println(X+Y);
	   }
}
}

	        