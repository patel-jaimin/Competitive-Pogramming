// Temple Land 
// Problem Code: TEMPLELA
// The snakes want to build a temple for Lord Cobra. There are multiple strips of land that    they are looking at, but not all of them are suitable. They need the strip of land to resemble a coiled Cobra. You need to find out which strips do so.

// Formally, every strip of land, has a length. Suppose the length of the i-th strip is is Ni, then there will be Ni integers, Hi1, Hi2, .. HiNi, which represent the heights of the ground at various parts of the strip, in sequential order. That is, the strip has been divided into Ni parts and the height of each part is given. This strip is valid, if and only if all these conditions are satisfied:

// There should be an unique 'centre' part. This is where the actual temple will be built. By centre, we mean that there should be an equal number of parts to the left of this part, and to the right of this part.
// Hi1 = 1
// The heights keep increasing by exactly 1, as you move from the leftmost part, to the centre part.
// The heights should keep decreasing by exactly 1, as you move from the centre part to the rightmost part. Note that this means that HiNi should also be 1.
// Your job is to look at every strip and find if it's valid or not.

// Input
// The first line contains a single integer, S, which is the number of strips you need to look at. The description of each of the S strips follows
// The first line of the i-th strip's description will contain a single integer: Ni, which is the length and number of parts into which it has been divided.
// The next line contains Ni integers: Hi1, Hi2, .., HiNi. These represent the heights of the various parts in the i-th strip.
// Output
// For each strip, in a new line, output "yes" if is a valid strip, and "no", if it isn't.
// Constraints
// 1 ≤ S ≤ 100
// 3 ≤ Ni ≤ 100
// 1 ≤ Hij ≤ 100
// Example
// Input:
// 7
// 5
// 1 2 3 2 1
// 7
// 2 3 4 5 4 3 2
// 5
// 1 2 3 4 3
// 5
// 1 3 5 3 1
// 7
// 1 2 3 4 3 2 1
// 4
// 1 2 3 2
// 4
// 1 2 2 1

// Output:
// yes
// no
// no
// no
// yes
// no
// no

// Solution :

import java.io.*;
public class Main
{
	public static void main(String[] args)throws IOException
	{
		int s,i;
		int[] stripes=new int[100];			
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		String str;
		str=br.readLine();
		s=Integer.parseInt(str);
 outer : while(s!=0)
	 	{
		int arr_size,t_arr=0,flag=0;
		int v_check=1;
		str=br.readLine();
		arr_size=Integer.parseInt(str.trim());
		str=br.readLine();
		String[] str_arr = str.trim().split(" ");
		
		for(i=0;i<arr_size;i++)
		{	
		  stripes[i]=Integer.parseInt(str_arr[i]);
		}
		if(arr_size<3)
		{
			System.out.println("no");
			s--;
			continue outer;
		}	
		t_arr=(arr_size-1);
         		
		 if((stripes[0]!=1)||(arr_size%2==0))
		{
			System.out.println("no");
			s--;
	        continue outer;	
		}
         	
		for(i=0;i<=(arr_size/2);i++)
		{
			  	if((stripes[i]==stripes[t_arr])&&(stripes[i]==v_check))
			{
				flag++;
				v_check++;
				t_arr--;
			}
			
			else
			{
				System.out.println("no");
				break;
			}
		}
				if(flag-1==arr_size/2)
					System.out.println("yes");
				
	s--;
		}	
		}
}