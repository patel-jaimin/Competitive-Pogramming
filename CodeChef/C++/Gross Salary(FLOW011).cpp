// Gross Salary 
// Problem Code: FLOW011

// In a company an emplopyee is paid as under: If his basic salary is less than Rs. 1500, then HRA = 10% of base salary and DA = 90% of basic salary.
// If his salary is either equal to or above Rs. 1500, then HRA = Rs. 500 and DA = 98% of basic salary. If the Employee's salary is input, write a program to find his gross salary.

// NOTE: Gross Salary = Basic Salary + HRA + DA

// Input
// The first line contains an integer T, total number of testcases. Then follow T lines, each line contains an integer salary.

// Output
// Output the gross salary of the employee. Your answer will be considered correct if the absolute error is less than 10-2.

// Constraints
// 1 ≤ T ≤ 1000
// 1 ≤ salary ≤ 100000
// Example
// Input
// 3
// 1203
// 10042
// 1312

// Output
// 2406.00
// 20383.16
// 2624

// Solution :

#include <iostream>
using namespace std;

int main() {

double s,t,h,da,gs;
cin>>t;
while(t!=0)
{
cin>>s;
if(s<1500)
{
   h=0.1*s;
   da=0.9*s;
   gs=s+h+da;
   cout<<gs<<endl;
}
else
{
    da=0.98*s;
    gs=s+500+da;
    cout<<gs<<endl;
}
t--;
}
	return 0;
}