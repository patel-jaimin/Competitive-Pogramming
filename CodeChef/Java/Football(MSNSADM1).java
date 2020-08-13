// Football 
// Problem Code: MSNSADM1

// A football competition has just finished. The players have been given points for scoring goals and points for committing fouls. Now, it is up to Alex to find the best player in the tournament. As a programmer, your job is to help Alex by telling him the highest number of points achieved by some player.

// You are given two sequences A1,A2,…,AN and B1,B2,…,BN. For each valid i, player i scored Ai goals and committed Bi fouls. For each goal, the player that scored it gets 20 points, and for each foul, 10 points are deducted from the player that committed it. However, if the resulting number of points of some player is negative, this player will be considered to have 0 points instead.

// You need to calculate the total number of points gained by each player and tell Alex the maximum of these values.

// Input
// The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
// The first line of each test case contains a single integer N.
// The second line contains N space-separated integers A1,A2,…,AN.
// The third line contains N space-separated integers B1,B2,…,BN.
// Output
// For each test case, print a single line containing one integer ― the maximum number of points.

// Constraints
// 1≤T≤100
// 1≤N≤150
// 0≤Ai≤50 for each valid i
// 0≤Bi≤50 for each valid i
// Subtasks
// Subtask #1 (30 points): 1≤N≤2
// Subtask #2 (70 points): original constraints

// Example Input
// 2
// 3
// 40 30 50
// 2 4 20
// 1
// 0
// 10
// Example Output
// 800
// 0

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
		Scanner sc=new Scanner(System.in);
		int T,N;
		T=sc.nextInt();
		while(T--!=0)
		{
		int max=0;    
		N=sc.nextInt();
		int Goals[]=new int[N];
		int Fouls[]=new int[N];
		for(int i=0;i<N;i++)
		   Goals[i]=sc.nextInt();
		for(int i=0;i<N;i++)
		   Fouls[i]=sc.nextInt();
		 int points=0;
		    for(int i=0;i<N;i++)
		    {
		        points=(Goals[i]*20)-(Fouls[i]*10);
		        if(points>max)
		           max=points;
		    }
		    System.out.println(max);    
		}
	}
}

