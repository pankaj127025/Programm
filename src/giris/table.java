package giris;

import java.util.Scanner;

public class table {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("print the number whose table you want to print ");
		
		int n=s.nextInt();
	//	System.out.println(n);
		for (int i=1;i<=10;i++)
		{
			int v=0;
			v=n*i;
			System.out.println(v);
		}
		
		
		
		
	}

}
