// Coder Life Matters 
// Problem Code: CODERLIF

// Coders/programmers are the backbone of the new age society (though whether they themselves have a strong back bone is debatable :P). As some wise man said, a task stops being fun when someone starts paying you to do it and commands you. Similarly, though coding is quite fun, in a corporate setting, if the coders work continuously without breaks, they will soon get tired and bored.

// You have data about the activities of a programmer over the month of April (which, in case you didn't know, has exactly 30 days). For each day, you know whether the programmer coded on that day or not. If the coder codes consecutively for more than 5 days, she gets bored. Given the activities of the programmer, tell whether she is always a happy person or whether she has gotten bored at some point. If she has been bored, you should support her by outputting "#coderlifematters", otherwise output "#allcodersarefun".

// Input
// The first line of the input contains an integer T denoting the number of test cases. The description of T cases follow.

// The only line of each test case contains 30 space separated boolean integers denoting whether the coder programmed on that day of the month or not. 1 signifies that she coded on that day, and a 0 denotes that she did not.

// Output
// For each test case, output in a single line "#coderlifematters" if the coder has been bored. If not, output "#allcodersarefun".

// Constraints
// 1 ≤ T ≤ 1000
// Example
// Input
// 4
// 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
// 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
// 1 1 1 1 1 0 0 1 1 1 1 1 0 0 1 1 1 1 1 0 0 1 1 1 1 1 0 0 1 1
// 1 1 1 1 1 1 1 0 0 0 0 0 0 0 1 1 1 1 1 1 1 0 0 0 0 0 0 0 1 1

// Output
// #coderlifematters
// #allcodersarefun
// #allcodersarefun
// #coderlifematters

// Solution :

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int t,count;
	  int work[]=new int[30];
	  Scanner sc=new Scanner(System.in);
	  t=sc.nextInt();
	  while(t--!=0)
	  {
	      count=0;
	      for(int i=0;i<30;i++)
	      {
	          work[i]=sc.nextInt();
	      }
	       for(int i=0;i<30;i++)
	       {
	            if(work[i]==1)
	           {
	             count++;
	             if(count==6)
	             {
	                 System.out.println("#coderlifematters");
	                 break;
	             }
	           }
	           else
	           count=0;
	      }
	       if(count<6)
	      System.out.println("#allcodersarefun");
	       }
	   }
    }
    
   