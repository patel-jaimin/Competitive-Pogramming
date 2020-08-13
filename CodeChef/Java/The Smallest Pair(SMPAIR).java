// The Smallest Pair 
// Problem Code: SMPAIR

// You are given a sequence a1, a2, ..., aN. Find the smallest possible value of ai + aj, where 1 ≤ i < j ≤ N.

// Input
// The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows. 

// The first line of each description consists of a single integer N.

// The second line of each description contains N space separated integers - a1, a2, ..., aN respectively.

// Output
// For each test case, output a single line containing a single integer - the smallest possible sum for the corresponding test case.

// Constraints
// T = 105, N = 2 : 13 points.
// T = 105, 2 ≤ N ≤ 10 : 16 points.
// T = 1000, 2 ≤ N ≤ 100 : 31 points.
// T = 10, 2 ≤ N ≤ 105 : 40 points.
// 1 ≤ ai ≤ 106
// Example
// Input:
// 1
// 4
// 5 1 3 4

// Output:
// 4

Solution :

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int T,N;
    Scanner sc=new Scanner(System.in);
	T=sc.nextInt();
	while(T--!=0)
	{
	    N=sc.nextInt();
	    int a[]=new int[N];
	    for(int i=0;i<N;i++)
	        a[i]=sc.nextInt();
	   Arrays.sort(a);
	   System.out.println(a[0]+a[1]);
	}
    }
}


