// Bear and Candies 123
// Problem Code: CANDY123
// Bears love candies and games involving eating them. Limak and Bob play the following game. Limak eats 1 candy, then Bob eats 2 candies, then Limak eats 3 candies, then Bob eats 4 candies, and so on. Once someone can't eat what he is supposed to eat, he loses.

// Limak can eat at most A candies in total (otherwise he would become sick), while Bob can eat at most B candies in total. Who will win the game? Print "Limak" or "Bob" accordingly.

// Input
// The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.

// The only line of each test case contains two integers A and B denoting the maximum possible number of candies Limak can eat and the maximum possible number of candies Bob can eat respectively.

// Output
// For each test case, output a single line containing one string — the name of the winner ("Limak" or "Bob" without the quotes).

// Constraints
// 1 ≤ T ≤ 1000
// 1 ≤ A, B ≤ 1000
// Example
// Input:
// 10
// 3 2
// 4 2
// 1 1
// 1 2
// 1 3
// 9 3
// 9 11
// 9 12
// 9 1000
// 8 11

// Output:
// Bob
// Limak
// Limak
// Bob
// Bob
// Limak
// Limak
// Bob
// Bob
// Bob

// Solution :


import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int T,A,B;
		 Scanner sc=new Scanner(System.in);
		 T=sc.nextInt();
		 while(T!=0)
		 {
		    int Acount=0;
		    int Bcount=0;
		     int limit;
		     A=sc.nextInt();
		     B=sc.nextInt();
		     if(A>B)
		     limit=A;
		     else
		     limit=B;
		     for(int i=1;i<=limit;i++)
		     {
		         if(i%2!=0)
		         {
		             Acount+=i;
		             if(Acount>A)
		             {
		               Acount-=i;
		              }
		         }
		         else
		         {
		             Bcount+=i;
		            if(Bcount>B)
		             {
		                 Bcount-=i;
		             } 
		         }
		     }
		   if(Acount>Bcount)
		     System.out.println("Limak");
		     else
		     System.out.println("Bob");
		     T--;
		 }
	}
}
