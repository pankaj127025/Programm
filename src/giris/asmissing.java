package giris;

import java.util.Scanner;

public class asmissing {
	public static void main(String[] args) {
		int temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Type 5 number");
		int a []=new int [5];
		for (int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		int max=0;
		for (int i=0;i<a.length;i++)
		{for (int j=i+1;j<a.length;j++)
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
						
			}
		}
		
		int b[]=new  int [max];
		for (int i=0;i<a.length;i++)
		{
			
		}
		
		for (int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
		for (int i=0;i<a.length;i++)
		{
                if (max<a[i])
{
	               max=a[i];
	
}
		}
	
		System.out.println("max number is "+max);
		
	}
		
		
	}


