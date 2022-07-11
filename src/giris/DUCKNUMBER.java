package giris;

import java.util.Scanner;

public class DUCKNUMBER {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("print the number you want to cheack its duck or not");
		int c=0;
		int n=s.nextInt();
		int i=1;
		int reminder=0;
		while(n!=0)
		{
			 reminder=n%10;
			n=n/10;
			if (reminder==0)
			{
				c++;
				}
		i++;
		}		
		
		
		if (c>=1)
		{
			System.out.println("the number is duck number ");
		}
		else 
		{
			System.out.println("number is not duck number");
		}
		
	}

}
