// Rectangle 
// Problem Code: RECTANGL

// You are given four integers a, b, c and d. Determine if there's a rectangle such that the lengths of its sides are a, b, c and d (in any order).

// Input
// The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
// The first and only line of each test case contains four space-separated integers a, b, c and d.
// Output
// For each test case, print a single line containing one string "YES" or "NO".

// Constraints
// 1 ≤ T ≤ 1,000
// 1 ≤ a, b, c, d ≤ 10,000
// Subtasks
// Subtask #1 (100 points): original constraints

// Example
// Input:

// 3
// 1 1 2 2
// 3 2 2 3
// 1 2 2 2

// Output:

// YES
// YES
// NO

// Solution :

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int T,a,b,c,d;
	  Scanner sc=new Scanner(System.in);
	  T=sc.nextInt();
	  while(T--!=0)
	  {
	      a=sc.nextInt();
	      b=sc.nextInt();
	      c=sc.nextInt();
	      d=sc.nextInt();
	      if(a==b&&c==d)
	      System.out.println("YES");
	      else if(a==c&&b==d)
	      System.out.println("YES");
	      else if(a==d&&b==c)
	      System.out.println("YES");
	      else if(a==b&&b==c&&c==d)
	      System.out.println("YES");
	      else
	      System.out.println("NO");
	  }
    }
}