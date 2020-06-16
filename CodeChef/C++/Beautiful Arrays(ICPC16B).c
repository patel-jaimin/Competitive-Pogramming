// Beautiful Arrays 
// Problem Code: ICPC16B
// An array a is called beautiful if for every pair of numbers ai, aj, (i ≠ j), there exists an ak such that ak = ai * aj. Note that k can be equal to i or j too.

// Find out whether the given array a is beautiful or not!

// Input
// First line of the input contains an integer T denoting the number of test cases. T test cases follow.

// First line of each test case contains an integer n denoting number of elements in a.

// Next line contains n space separated integers denoting the array a.

// Output
// For each test case, output a single line containing "yes" or "no" (without quotes) corresponding to the answer of the problem.

// Constraints
// 1 ≤ T ≤ 106
// 1 ≤ n ≤ 105
// Sum of n over all the test cases ≤ 106
// -109 ≤ ai ≤ 109
// Example
// Input
// 3
// 2
// 0 1
// 2
// 1 2
// 2
// 5 6

// Output:
// yes
// yes
// no

// Solution:

#include<stdio.h>
int main()
{
    int a,b,c,l,i,j,k,t;
    scanf("%d",&t);
    while(t--)
    {   b=j=k=c=0;
        scanf("%d",&l);
        for(i=0;i<l;i++)
        {
            scanf("%d",&a);
            if(a==0)
                b++;
           else if(a==1)
                j++;
          else if(a==(-1))
                k++;
            else
                c++;
        }
        if(c>1)
            printf("no\n");
            else{
                    if(k&&c)
                printf("no\n");
           else if((j==0)&&(k>1))
 
                printf("no\n");
           else
            printf("yes\n");}
    }
            return 0;}