package numeric;

import java.util.Scanner;

public class armstrongnumber {
	public static void main(String[] args) {
		int rem;
		int result = 0;
		Scanner sc=new Scanner (System.in);
		System.out.println("print the number which yiu want to check its armstrong or not ");
		int n=sc.nextInt();
		int s=n;

		while(n>0)
		{
		rem=n%10;
		result=rem*rem*rem+result;
		n=n/10;
 	System.out.println(result);
		
		}
		
		System.out.println(result);
		if (s==result )
			System.out.println("number is armstrong");
		else
			System.out.println("number is  nootb arm");
	}

}
