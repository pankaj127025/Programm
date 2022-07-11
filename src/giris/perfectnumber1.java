package giris;

import java.util.Scanner;

public class perfectnumber1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("type any number to check its perfect or not");
		int n=s.nextInt();
	
		int i=1;
		int reminder;
		int sum=0; ;
		while( i<n)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		i++;	
		}
	if (n==sum)
	{
		System.out.println("number is perfect number ");
	}
	else
	{
		System.out.println("the numbe is not perfect mnumber ");
	}
		
		
	}

}
