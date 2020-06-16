// Chef and Employment Test 
// Problem Code: CK87MEDI

// Even though it was a little unexpected, Chef did it! He has finally opened a new restaurant!

// As you all know, to make everything go well, Chef needs employees (co-chefs if you might say). Because Chef is a perfectionist, he planned to employ only chefs who are good at competitive progeamming. Hence, Chef asked for help from his friends Shahhoud and Said. Knowing that many people (such as Ahmad, Nour, Majd and Joud) will apply for the job, they decided to choose only the best appliers.

// As the day of the employment came, people lined up in front of the restaurant applying for the job. Before accepting any appliers, Shahhoud and Said decided to make them answer a simple question, in order to determine which of them better deserves the job.

// Given an array of N elements A1, A2, ..., AN, each applier was asked to insert any K integers he wants to this array. Eventually, each applier will be asked to write down the median among all the elements in his resulting array. Many appliers asked for your help to determine what is the greatest median they can get after inserting any K elements they want?

// Note that the median in an array is the element positioned at the center of the array after sorting it. E.g. the median in [2, 1, 5, 2, 4] is 2, and the median in [3, 3, 1, 3, 3] is 3.

 

// Input
// The first line of the input contains an integer T denoting the number of test cases.

// The first line of each test case contains two space separated integers N and K denoting the array length, and the number of elements to be inserted.

// The second line of each test case contains N space separated integers A1, A2, ..., AN denoting the elements of the array.

// Output
// For each test case output a single line, containing a single integer, indicating the greatest median the applier can obtain after inserting exactly K new elements into the given array.

// Constraints
// 1 ≤ T ≤ 100.
// 0 ≤ K < N ≤ 100.
// 0 ≤ Ai ≤ 1000.
// N + K is guaranteed to be odd.
 

// Example
// Input:
// 3
// 2 1
// 4 7
// 4 3
// 9 2 8 6
// 5 2
// 6 1 1 1 1

// Output:
// 7
// 9
// 1

// Solution :

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int T,N,K;
	    Scanner sc=new Scanner(System.in);
	    T=sc.nextInt();
	    while(T--!=0)
	    { 
	        
	        N=sc.nextInt();
	        K=sc.nextInt();
	        int[] num=new int[N];
	        for(int i=0;i<N;i++)
	          num[i]=sc.nextInt();
	        Arrays.sort(num);  
	        int center=((N+K)/2);
	       int median=num[center];
	        System.out.println(median);
	    }
         	
	    
	}
}