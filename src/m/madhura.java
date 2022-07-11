package m;

import java.util.Scanner;

public class madhura {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Print the number which u want to reverse ");
		int n=s.nextInt();
		System.out.println(n);
		int reminder=0;
		int result=0;
	while (n>0)
		{
			reminder=n%10;
			result=result*10+reminder;
			n=n/10;
			
		}
		System.out.println(result);
		
	}

}
