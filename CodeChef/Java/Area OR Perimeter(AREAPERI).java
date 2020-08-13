// Area OR Perimeter 
// Problem Code: AREAPERI

// Write a program to obtain length (L) and breadth (B) of a rectangle and check whether its area is greater or perimeter is greater or both are equal.

// Input:
// First line will contain the length (L) of the rectangle.
// Second line will contain the breadth (B) of the rectangle.
// Output:
// Output 2 lines.

// In the first line print "Area" if area is greater otherwise print "Peri" and if they are equal print "Eq".(Without quotes).

// In the second line print the calculated area or perimeter (whichever is greater or anyone if it is equal).

// Constraints
// 1≤L≤1000
// 1≤B≤1000
// Sample Input:
// 1
// 2
// Sample Output:
// Peri
// 6

// Solution :

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int L,B;
	    Scanner sc=new Scanner(System.in);
	    L=sc.nextInt();
	    B=sc.nextInt();
	    int Area=L*B;
	    int Peri=2*(L+B);
	    if(Area>Peri)
	    System.out.println("Area\n"+Area);
	    else
	    System.out.println("Peri\n"+Peri); 
	}
}