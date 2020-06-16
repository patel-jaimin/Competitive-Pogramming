// Archi and Comparsion 
// Problem Code: NUMCOMP

// Danya gave integers a, b and n to Archi. Archi wants to compare an and bn. Help Archi with this task.

// Input
// The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
// The first and only line of each test case contains three space-separated integers a, b and n.
// Output
// For each test case, print a single line containing one integer: 1 if an>bn, 2 if an<bn or 0 if an=bn.

// Constraints
// 1≤T≤1,000
// |a|,|b|≤109
// 1≤n≤109
// Example Input
// 2
// 3 4 5
// -3 2 4
// Example Output
// 2
// 1

// Solution :

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     int t,a,b,n;
	     Scanner sc=new Scanner(System.in);
	     t=sc.nextInt();
	     while(t--!=0)
	     {
	         a=sc.nextInt();
	         b=sc.nextInt();
	         n=sc.nextInt();
	         if(n%2==0)
	         {
	             if(a<0)
	             a=(-1*a);
	             if(b<0)
	             b=(-1*b);
	         }
	         if(a>b)
	         System.out.println("1");
	         else if(a<b)
	         System.out.println("2");
	         else
	         System.out.println("0");
	        }
	   }
}

	        