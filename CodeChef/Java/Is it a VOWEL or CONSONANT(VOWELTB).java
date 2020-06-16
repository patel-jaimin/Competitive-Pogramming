// Is it a VOWEL or CONSONANT 
// Problem Code: VOWELTB
// Write a program to take a character (C) as input and check whether the given character is a vowel or a consonant.

// NOTE:− Vowels are 'A', 'E', 'I', 'O', 'U'. Rest all alphabets are called consonants.

// Input:
// First line will contain the character C.
// Output:
// Print "Vowel" if the given character is a vowel, otherwise print "Consonant".

// Constraints
// C will be an upper case English alphabet
// Sample Input:
// Z
// Sample Output:
// Consonant

// Solution:

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    boolean found=false;
	    Scanner sc=new Scanner(System.in);
	    char C=sc.next().charAt(0);
	    switch(C)
	    {
	        case 'A':
	        case 'E':
	        case 'I':
	        case 'O':
	        case 'U': found=true;
	    }
	    if(found)
	    System.out.println("Vowel");
	    else
	    System.out.println("Consonant");
	}
}