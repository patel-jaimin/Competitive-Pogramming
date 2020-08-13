// Workers 
// Problem Code: CHEFWORK

// There are N workers; each worker is of one of the following three types:

// A translator translates some text from Chef's language to another langague.
// An author writes some text in Chef's language.
// An author-translator can both write a text in Chef's language and translate it to another language.
// Chef wants to have some text written and translated into some language (different from Chef's language). Chef can't do either of those tasks, but he can hire workers. For each i (1≤i≤N), if he hires the i-th worker, he must pay that worker ci coins.

// Help Chef find the minimum total number of coins he needs to pay to have a text written and translated. It is guaranteed that it is possible to write and translate a text.

// Input
// The first line of the input contains a single integer N denoting the number of workers.
// The second line contins N space-separated integers c1,c2,...,cN denoting the numbers of coins Chef has to pay each hired worker.
// The third line contains N space-separated integers t1,t2,...,tN denoting the types of workers. For each valid i, the i-th worker is a translator if ti=1, an author if ti=2 or an author-translator if ti=3.
// Output
// Print a single line containing one integer — the minimum number of coins Chef has to pay.

// Constraints
// 1≤N≤1,000
// 1≤ci≤100,000 for each valid i
// 1≤ti≤3 for each valid i
// Subtasks
// Subtask #1 (15 points): all workers are author-translators

// Subtask #2 (85 points): original constraints

// Example Input

// 5   
// 1 3 4 6 8   
// 1 2 1 2 3   
// Example Output

// 4


// Solution :

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	 int N,l1,l2,l3;
	 l1=100000;
	 l2=100000;
	 l3=100000;
	 N=sc.nextInt();
	 int t[]=new int[N];
	 int p[]=new int[N];
	 for(int i=0;i<N;i++)
	     p[i]=sc.nextInt();
	 for(int j=0;j<N;j++)
	 {
	     t[j]=sc.nextInt();
	     if(t[j]==1)
	     {
	         if(p[j]<l1)
	         l1=p[j];
	     }
	     if(t[j]==2)
	     {
	         if(p[j]<l2)
	         l2=p[j];
	     }
	     if(t[j]==3)
	     {
	         if(p[j]<l3)
	         l3=p[j];
	     }
	 }
	 if((l1+l2)<l3)
	 System.out.println(l1+l2);
	 else
	 System.out.println(l3);
	}
	
}