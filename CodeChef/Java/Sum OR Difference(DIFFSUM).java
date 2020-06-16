// Sum OR Difference
// Problem Code: DIFFSUM
// Write a program to take two numbers as input and print their difference if the first number is greater than the second number otherwise print their sum.

// Input:
// First line will contain the first number (N1)
// Second line will contain the second number (N2)
// Output:
// Output a single line containing the difference of 2 numbers (N1−N2) if the first number is greater than the second number otherwise output their sum (N1+N2).

// Constraints
// −1000≤N1≤1000
// −1000≤N2≤1000
// Sample Input:
// 82
// 28
// Sample Output:
// 54

// Solution :

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int N1,N2;
	    Scanner sc=new Scanner(System.in);
	    N1=sc.nextInt();
	    N2=sc.nextInt();
	    if(N1>N2)
	    System.out.println(N1-N2);
	    else
	    System.out.println(N1+N2);
	}
}