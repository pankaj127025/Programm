package array;

import java.util.Scanner;

public class practise {
	public static void main(String[] args) {
		
		// MAX NO IN ARRAY 
//		
//		
//		int a[]=new int [4];
//		Scanner s=new Scanner(System.in);
//		for (int i=0;i<a.length;i++)
//		{
//			a[i]=s.nextInt();
//		}
//		int max=a[0];
//		
//		for (int i=0;i<a.length;i++)
//		{
//			if(max<a[i])
//			{
//				max=a[i];
//				
//			}
//		}
//		System.out.println("MAX NUMBER IN ARRAY IS "+max);
//		
//	
		
		int b[]=new int  [3];
		Scanner s=new Scanner (System.in);
		System.out.println("print the number ");
		for(int i=0;i<b.length;i++)
		{
			b[i]=s.nextInt();
			
		}
		
	int 	min=b[0];
		
	for(int i=0;i<b.length;i++)
	{
		if(min>b[i])
		{ min=b[i];}
		
	}
	System.out.println(" min number in arrAy is  "+min);
	}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}


