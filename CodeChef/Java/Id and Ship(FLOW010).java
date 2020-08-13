// Id and Ship 
// Problem Code: FLOW010 :

// Write a program that takes in a letterclass ID of a ship and display the equivalent string class description of the given ID. Use the table below.

// Class ID	Ship Class
// B or b	BattleShip
// C or c	Cruiser
// D or d	Destroyer
// F or f	Frigate
// Input
// The first line contains an integer T, total number of testcases. Then follow T lines, each line contains a character.

// Output
// Display the Ship Class depending on ID.

// Constraints
// 1 ≤ T ≤ 1000
// Example
// Input

// 3 
// B
// c
// D

// Output
// BattleShip
// Cruiser
// Destroyer

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
	char c;
	Scanner sc=new Scanner(System.in);
	T=sc.nextInt();
	while(T--!=0)
	{
	   c= sc.next().charAt(0);
	   switch(Character.toLowerCase(c))
	   {
	       case 'b' : System.out.println("BattleShip");
	                        break;
	       case 'c' : System.out.println("Cruiser");
	                        break;
	       case 'd' : System.out.println("Destroyer");
	                        break;
	       case 'f' : System.out.println("Frigate");
	                                      
	   }
	}
	
     }
}

