package giris;

import java.util.Scanner;

public class sumofgivennumber {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		
		int a[]=new int[5];
		int v=0;
		System.out.println("print the number which u wanted to add mac 5 ");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<=a.length-1;i++)
		{
			 v=v+a[i];
		}
		System.out.println(v);
		
	}

}
