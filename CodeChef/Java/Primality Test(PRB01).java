// Primality Test 
// Problem Code: PRB01 

// Alice and Bob are meeting after a long time. As usual they love to play some math games. This times Alice takes the call and decides the game. The game is very simple, Alice says out an integer and Bob has to say whether the number is prime or not. Bob as usual knows the logic but since Alice doesn't give Bob much time to think, so Bob decides to write a computer program.

// Help Bob accomplish this task by writing a computer program which will calculate whether the number is prime or not .

// Input
// The first line of the input contains T testcases, T lines follow

// Each of T line contains an integer N which has to be tested for primality

// Output
// For each test case output in a separate line, "yes" if the number is prime else "no"

// Constraints
// - 1≤T≤20

// - 1≤N≤105

// Input:
// 5
// 23
// 13
// 20
// 1000
// 99991

// Output:
// yes
// yes
// no
// no
// yes

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
	int T,num;
	Scanner sc=new Scanner(System.in);
	T=sc.nextInt();
	while(T--!=0)
	{
	boolean found=true;
	num=sc.nextInt();
	for(int i=2;i<=num/2;i++)
	{
		if(num%i==0)
		{
			found=false;
			break;
		}
	}
    if(found&&num!=1&&num!=0)
    	System.out.println("yes");
    else
    	System.out.println("no");
		 }
	
     }
}


