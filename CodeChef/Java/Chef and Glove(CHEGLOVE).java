// Chef and Glove 
// Problem Code: CHEGLOVE

// Winter has finally come to Chefland, so Chef bought a glove for herself. Chef has a hand with N fingers (for the sake of simplicity, let us consider the thumb a finger too) numbered 1 through N and the glove has N sheaths numbered 1 through N. Exactly one finger has to be inserted into each sheath. You are given the lengths of Chef's fingers, as seen from left to right. You are also given the lengths of the sheaths of the glove, from left to right, as seen from the front.

// Chef can wear the glove normally (the front side of the glove matching the front of Chef's hand), or she can flip the glove and then insert her hand in it. In the first case, the first finger will go into the first sheath, the second finger into the second one, and so on. However, when she flips the glove, her first finger will go into the N-th sheath, the second finger into the (N-1)-th and so on — the i-th finger will go into the N+1-i-th sheath for each valid i. Of course, for her to wear the glove comfortably, each finger's length should be less than or equal to the length of the sheath it goes into.

// Find out whether Chef can wear the glove by keeping its front side facing her, or if she can wear it by flipping it over and facing its back side. If she can only wear the glove in the former way, output "front"; if she can wear it only in the latter way, output "back". If both front and back orientations can be used, output "both", and if she can't wear it either way, output "none".

// Input
// The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.

// The first line of each test case contains a single integer N denoting the number of Chef's fingers.

// The second line contains N space-separated integers L1, L2, ..., LN denoting the lengths of Chef's fingers.

// The third line contains N space-separated integers G1, G2, ..., GN, denoting the lengths of sheaths of the glove.

// Output
// For each test case, print a single line containing one of the strings "front", "back", "both", or "none".

// Constraints
// 1 ≤ T ≤ 10
// 1 ≤ N ≤ 105
// 1 ≤ Li ≤ 109 for each valid i
// 1 ≤ Gi ≤ 109 for each valid i
// Subtasks
// Subtask #1 (30 points): 1 ≤ N ≤ 102

// Subtask #2 (70 points): original constraints

// Example
// Input

// 4
// 3
// 1 2 3
// 2 3 4
// 3
// 1 2 1
// 1 2 1
// 3
// 3 2 1
// 1 2 3
// 4
// 1 3 2 4
// 1 2 3 5

// Output

// front
// both
// back
// none

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
	  int frontcount=0;
	  int backcount=0;
	  N=sc.nextInt();  
	  int[] fingers=new int[N];
	  int[] gloves=new int[N];
	  for(int i = 0; i < N; i++)
        {
            fingers[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++)
        {
            gloves[i] = sc.nextInt();
        }
      for(int i=0;i<N;i++)
      {
          if(fingers[i]<=gloves[i])
          {
              frontcount++;
          }
          if(fingers[(N-1)-i]<=gloves[i])
          {
              backcount++;
          }
      }
      if(frontcount==N&&backcount==N)
      System.out.println("both");
      else if(frontcount==N)
      System.out.println("front");
      else if(backcount==N)
      System.out.println("back");
      else
      System.out.println("none");
	}
	}
}