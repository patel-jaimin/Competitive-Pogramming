// The Great Run 
// Problem Code: PROC18A

// Vishal loves running. He often visits his favourite Nehru Park and runs for very long distances. On one such visit he found that the number of girls in the park was unusually high. Now he wants to use this as an opportunity to impress a large number of girls with his awesome speed.

// The track on which he runs is an N kilometres long straight path. There are ai girls standing within the ith kilometre of this path. A girl will be impressed only if Vishal is running at his maximum speed when he passes by her. But he can run at his best speed only for a single continuous stretch of K kilometres. Now Vishal wants to know what is the maximum number of girls that he can impress.

// Input
// First line of the input contains the number of testcases T.

// For each test case,

// First line contains two space-separated integers N and K, the length of the track and the maximum distance he can run at his best speed.

// Second line contains N space-separated integers, the number of girls within each kilometre of the track.

// Output
// For each test case print one line containing an integer, denoting the maximum number of girls Vishal can impress.

// Constraints
// 1≤T≤10
// 1≤K≤N≤100

// 1≤ai≤100

// Sample Input
// 1
// 7 2
// 2 4 8 1 2 1 8
// Sample Output
// 12


// Solution :

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int T;
	Scanner sc=new Scanner(System.in);
	T=sc.nextInt();
	while(T--!=0)
	{
	   int N,K,Girls=0,Greatest=0;
	   N=sc.nextInt();
	   K=sc.nextInt();
	   int girls[]=new int[N];
	   for(int i=0;i<N;i++)
	    girls[i]=sc.nextInt();
	   for(int i=0;i<=N-K;i++)
	   {
	       for(int j=i;j<(i+K);j++)
	           Greatest+=girls[j];
	       if(Girls<Greatest)
	        {
	              Girls=Greatest;
	              Greatest=0;
	        }
	        else
	              Greatest=0;
	   }
	   System.out.println(Girls);
	    
	}
	}
}