// Kill them with your success 
// Problem Code: PROC18B

// Tanish is the president of the chemistry club at his school. He considers everyone who doesn't like chemistry as his enemy. After years of research, he has invented a lethal poison, which he named success. Now Tanish plans to kill all his enemies with his success. Success is extremely deadly and is untraceable in small concentrations.

// Tanish has N flasks lying on the shelf of his lab. All of these flasks contain the same volume of poison solution. The concentration of poison in the ith flask is ai. In one move - Tanish picks up any two flasks, pours half of the contents of each of these flasks into a third initially empty flask, discards the two flasks and places the third flask (which now has the same volume of solution as all other flasks) on the shelf. He performs N-1 such moves to end up with only one flask of poison on the shelf. He wishes to perform these moves such that the concentration of poison in this flask is the minimum possible. What is the minimum concentration of poison that he can achieve?

// Input
// First line of the input contains a single integer T - the number of test cases.

// For each test case,

// The first line contains a single integer N, the number of bottles.

// The second line contains N space-separated integers, the concentrations.

// Output
// For each test case, print one line containing the lowest final concentration. The output will be accepted if the absolute error is ≤10−6.

// Constraints
// 1≤T≤10
// 2≤N≤104
// 0≤ai≤109
// Sample Input
// 2
// 2
// 9 3
// 3
// 3 2 9
// Sample Output
// 6.00000000
// 4.00000000

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
	 int N;
	 N=sc.nextInt();
	 Double poison[]=new Double[N];
	 for(int i=0;i<N;i++)
	     poison[i]=sc.nextDouble();
	 Arrays.sort(poison, Collections.reverseOrder());
	 for(int i=0;i<N-1;i++)
	     poison[i+1]=(poison[i]+poison[i+1])/2;
	 System.out.println(poison[N-1]); 
	 }
	}
}