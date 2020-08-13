// A Big Sale 
// Problem Code: BIGSALE

// Chef recently opened a big e-commerce website where her recipes can be bought online. It's Chef's birthday month and so she has decided to organize a big sale in which grand discounts will be provided.

// In this sale, suppose a recipe should have a discount of x percent and its original price (before the sale) is p. Statistics says that when people see a discount offered over a product, they are more likely to buy it. Therefore, Chef decides to first increase the price of this recipe by x% (from p) and then offer a discount of x% to people.

// Chef has a total of N types of recipes. For each i (1 ≤ i ≤ N), the number of recipes of this type available for sale is quantityi, the unit price (of one recipe of this type, before the x% increase) is pricei and the discount offered on each recipe of this type (the value of x) is discounti.

// Please help Chef find the total loss incurred due to this sale, if all the recipes are sold out.

// Input
// The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
// The first line of each test case contains a single integer N denoting the number of recipe types.
// N lines follow. The i-th of these lines contains three space-separated integers pricei, quantityi and discounti describing the i-th recipe type.
// Output
// For each test case, print a single line containing one real number — the total amount of money lost. Your answer will be considered correct if it has an absolute error less than 10-2.

// Constraints
// 1 ≤ T ≤ 10
// 1 ≤ N ≤ 105
// 1 ≤ pricei, quantityi ≤ 100 for each valid i
// 0 ≤ discounti ≤ 100 for each valid i
// Subtasks
// Subtask #1 (30 points): 1 ≤ N ≤ 100

// Subtask #2 (70 points): original constraints

// Example
// Input:

// 2
// 2
// 100 5 10
// 100 1 50
// 3
// 10 10 0
// 79 79 79
// 100 1 100

// Output:

// 30.000000000
// 3995.0081000

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
		 double T,N,Iprice,Mprice,Tsell,WDsell,Loss,Sprice,quantity,discount;
		
		 Scanner sc=new Scanner(System.in);
		 T=sc.nextInt();
		 while(T--!=0)
		 {
		     Loss=0;
		     N=sc.nextInt();
		     while(N--!=0)
		     {
		     Iprice=sc.nextInt();
		     quantity=sc.nextInt();
		     discount=sc.nextInt();
		     Mprice=((100+discount)/100)*Iprice;
		     Sprice=Mprice-((discount/100)*Mprice);
		     Tsell=Sprice*quantity;
		     WDsell=Iprice*quantity;
		     Loss+=WDsell-Tsell;
		     
		     }
		     System.out.println(Loss);
		 }
	}
}
