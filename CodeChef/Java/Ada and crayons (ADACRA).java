// Ada and crayons 
// Problem Code: ADACRA
// Ada has an array of N crayons, some crayons are pointing upwards and some downwards. Ada thinks that an array of crayons is beautiful if all the crayons are pointing in the same direction.

// In one step you can flip any segment of consecutive crayons. After flipping a segment, all crayons pointing downwards will point upwards and visceversa

// What is the minimum number of steps to make the array of crayons beautiful?

// Input
// The first line of the input contains T the number of test cases. Each test case is described in one line containing a string S of N characters, the i-th character is 'U' if the i-th crayon is pointing upwards and 'D' if it is pointing downwards.

// Output
// For each test case, output a single line containing the minimum number of flips needed to make all crayons point to the same direction.

// Constraints
// 1 ≤ T ≤ 3000
// 1 ≤ N ≤ 50
// Example
// Input:
// 1
// UUDDDUUU

// Output:
// 1

// Soluton:

import java.io.*; 
class Crayons
{
	 
public static void main(String[] args)throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br= new BufferedReader(isr);
int i,t=0; 
char[] str = new char[50];  

String temp;
String test;
test= br.readLine();
t=Integer.parseInt(test);
 
while(t!=0)
{
	int D_times=0;
	int U_times=0;
	int u_check=0;
	int d_check=0;
	temp=br.readLine();
	str=temp.toCharArray();
	for(i=0;i<str.length;i++) 
	  {
		  if(str[i]=='D')
		  {
			  if(d_check==0)
				  {
					  D_times++;
					  d_check++;
					  u_check=0;
				  }  
			    
		  }
		  else if(str[i]=='U') 
		  {
			  if(u_check==0)
			  {
			  U_times++;
			  u_check++;
			  d_check=0;
			  }
		  }
		}
		if(D_times>=U_times)
		System.out.println(U_times);
		else
		System.out.println(D_times);	
		t--;
}		
	  
} 
}