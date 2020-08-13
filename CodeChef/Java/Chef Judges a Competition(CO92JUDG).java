// Chef Judges a Competition 
// Problem Code: CO92JUDG

// Chef is the judge of a competition. There are two players participating in this competition — Alice and Bob.

// The competition consists of N races. For each i (1 ≤ i ≤ N), Alice finished the i-th race in Ai minutes, while Bob finished it in Bi minutes. The player with the smallest sum of finish times wins. If this total time is the same for Alice and for Bob, a draw is declared.

// The rules of the competition allow each player to choose a race which will not be counted towards their total time. That is, Alice may choose an index x and her finish time in the race with this index will be considered zero; similarly, Bob may choose an index y and his finish time in the race with this index will be considered zero. Note that x can be different from y; the index chosen by Alice does not affect Bob's total time or vice versa.

// Chef, as the judge, needs to announce the result of the competition. He knows that both Alice and Bob play optimally and will always choose the best option. Please help Chef determine the result!

// Input
// The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
// The first line of each test case contains a single integer N.
// The second line contains N space-separated integers A1, A2, ..., AN.
// The third line contains N space-separated integers B1, B2, ..., BN.
// Output
// For each test case, print a single line containing the string "Alice" if Alice wins, "Bob" if Bob wins or "Draw" if the result is a draw (without quotes).

// Constraints
// 1 ≤ T ≤ 100
// 2 ≤ N ≤ 100
// 1 ≤ Ai ≤ 1000 for each valid i
// 1 ≤ Bi ≤ 1000 for each valid i
// Example
// Input:

// 3
// 5
// 3 1 3 3 4
// 1 6 2 5 3
// 5
// 1 6 2 5 3
// 3 1 3 3 4
// 3
// 4 1 3
// 2 2 7

// Output:

// Alice
// Bob
// Draw


// Solution :

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     int t,n;
	     Scanner sc=new Scanner(System.in);
	     t=sc.nextInt();
	     while(t--!=0)
	     {
	     int asum=0;
	     int bsum=0;
	     int agreater=0;
	     int bgreater=0;
	     n=sc.nextInt();
	     int alice[]=new int[n];
	     int bob[]=new int[n];
	     for(int i=0;i<n;i++)
	     {
	         alice[i]=sc.nextInt();
	           asum+=alice[i];
	         if(agreater<alice[i])
	              agreater=alice[i];
	     }
	     for(int i=0;i<n;i++)
	     {
	         bob[i]=sc.nextInt();
	           bsum+=bob[i];
	         if(bgreater<bob[i])
	              bgreater=bob[i];
	     }
	    int aresult=asum-agreater;
	   int  bresult=bsum-bgreater;
	     if(aresult>bresult)
	     System.out.println("Bob");
	     else if(bresult>aresult)
	     System.out.println("Alice");
	     else
	     System.out.println("Draw");
	   }
	   }
}

	        