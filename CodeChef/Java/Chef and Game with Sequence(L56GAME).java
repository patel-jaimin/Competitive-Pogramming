// Chef and Game with Sequence 
// Problem Code: L56GAME

// Chef has a sequence A containing N integers A1, A2, ..., AN.

// Chef is playing a game with this sequence. In this game, he may perform the following operation any number of times (including zero): Choose an arbitrary pair of elements from the sequence such that their sum is even, delete these two elements from the sequence and insert their sum into the sequence instead.

// The goal of the game is to minimise the number of elements in the sequence.

// Help Chef to play the game and find the minimum possible size of the sequence at the end of the game!

// Input
// The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
// The first line of each test case contains a single integer N.
// The second line contains N space-separated integers A1, A2, ..., AN.
// Output
// For each test case, print a single line containing one integer — the minimum possible final size of the sequence.

// Constraints
// 1 ≤ T ≤ 100
// 1 ≤ N ≤ 100
// 1 ≤ Ai ≤ 1,000 for each valid i
// Subtasks
// Subtask #1 (100 points): original constraints

// Example
// Input:

// 2
// 2
// 1 2
// 5
// 7 4 3 2 6

// Output:

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
	     int T,N;
	     Scanner sc=new Scanner(System.in);
	     T=sc.nextInt();
	     while(T--!=0)
	     {
	      int ocount=0;
	      N=sc.nextInt();
	      int A[]=new int[N];
	      for(int i=0;i<N;i++)
	      {
	          A[i]=sc.nextInt();
	          if(A[i]%2!=0)
	              ocount++;
	      }
	      if(ocount%2==0||N==1)
	        System.out.println("1");
	        else
	        System.out.println("2");
	      
	     }
	   }
}