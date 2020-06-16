// HOW MANY DIGITS DO I HAVE 
// Problem Code: HOWMANY

// Write a program to obtain a number (N) from the user and display whether the number is a one digit number, 2 digit number, 3 digit number or more than 3 digit number

// Input:
// First line will contain the number N,
// Output:
// Print "1" if N is a 1 digit number.

// Print "2" if N is a 2 digit number.

// Print "3" if N is a 3 digit number.

// Print "More than 3 digits" if N has more than 3 digits.

// Constraints
// 0≤N≤1000000
// Sample Input:
// 9
// Sample Output:
// 1

// Solution :

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int N,count=0;
	    Scanner sc=new Scanner(System.in);
	    N=sc.nextInt();
	    while(N!=0)
	    {
	        N=N/10;
	        count++;
	    }
	    switch(count)
	    {
	     case 1: System.out.println("1");
	        break;
	        case 2: System.out.println("2");
	        break;
	        case 3: System.out.println("3");
	        break;
	        default: System.out.println("More than 3 digits");
	   }
	     
	}
}
	        