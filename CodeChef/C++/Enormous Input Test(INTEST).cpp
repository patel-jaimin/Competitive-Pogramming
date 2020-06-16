// Enormous Input Test 
// Problem Code: INTEST
// The purpose of this problem is to verify whether the method you are using to read input data is sufficiently fast to handle problems branded with the enormous Input/Output warning. You are expected to be able to process at least 2.5MB of input data per second at runtime.

// Input
// The input begins with two positive integers n k (n, k<=107). The next n lines of input contain one positive integer ti, not greater than 109, each.

// Output
// Write a single integer to output, denoting how many integers ti are divisible by k.

// Example
// Input:
// 7 3
// 1
// 51
// 966369
// 7
// 9
// 999996
// 11

// Output:
// 4

// Solution :

#include<stdio.h>
int main()
{
    int n,c=0;
    long long int k,a;
    scanf("%d %lld",&n,&k);
    for(int i=0;i<n;i++)
    {
        scanf("%lld ",&a);
        if(a%k==0)
            c++;
    }
    printf("%d",c);
    return 0;
}