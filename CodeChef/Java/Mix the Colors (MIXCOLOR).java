// Mix the Colors 
// Problem Code: MIXCOLOR

// Chef likes to mix colors a lot. Recently, she was gifted N colors A1, A2, ..., AN by her friend.

// Chef wants to make the values of all her colors pairwise distinct, as they will then look stunningly beautiful. In order to achieve that, she can perform the following mixing operation zero or more times:

// Choose any two colors. Let's denote their values by x and y.
// Mix the color with value x into the color with value y. After the mixing, the value of the first color remains x, but the value of the second color changes to x + y.
// Find the minimum number of mixing operations Chef needs to perform to make her colors beautiful.

// Input
// The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
// The first line of each test case contains a single integer N denoting the number of colors.
// The second line contains N space-separated integers A1, A2, ..., AN denoting Chef's initial colors.
// Output
// For each test case, print a single line containing one integer — the minimum number of required mixing operations.

// Constraints
// 1 ≤ T ≤ 10
// 1 ≤ N ≤ 105
// 1 ≤ Ai ≤ 109 for each valid i
// Subtasks
// Subtask #1 (30 points): 1 ≤ N ≤ 100

// Subtask #2 (70 points): original constraints

// Example
// Input:

// 2
// 3
// 1 2 3
// 3
// 2 1 2

// Output:

// 0
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
BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
T=Integer.parseInt(br.readLine());
while(T--!=0)
{
		    int count=0;
		    double highest=0;
		    N=Integer.parseInt(br.readLine());
		    double[] colours=new double[N];
		     String temp=br.readLine();
		     String[] strs=temp.trim().split("\\s+");
		     for(int i=0;i<N;i++)
		     {
		         colours[i]=Double.parseDouble(strs[i]);
		     }
		     Arrays.sort(colours);
		      for(int i=0;i<N-1;i++)
		     {
		         if(colours[i]==colours[i+1])
		         count++;
		      }
		      System.out.println(count);
	        }
	  }
}