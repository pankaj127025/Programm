package array;

import java.util.Scanner;

public class reversearray {
	public static void main(String[] args) {
		
	
	
	int v[]=new int[5];
	Scanner s=new Scanner(System.in);
System.out.println("type any number");

	for (int i=0;i<v.length;i++)
		
	{
		v[i]=s.nextInt();
	}

	for (int j=v.length-1 ;j>=0;j--)
	{
		System.out.println("print "+v[j]);
	}
	
	
}
}