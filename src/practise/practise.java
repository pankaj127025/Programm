package practise;

import java.util.Scanner;

public class practise {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("print any 5 number you want to find out duplicate in array ");
		int a[]=new int[5];
		for (int i=0;i<=a.length-1;i++)
		
		{	a[i]=s.nextInt();}
		for (int i=0;i<=a.length;i++)
		{
			for (int j=i+1;j<=a.length;j++)
				if(a[i]==a[j])
				{
					System.out.println("dupplicate of an array  "+a[j]);
				}
		}
		
		
		
		
	}

}
