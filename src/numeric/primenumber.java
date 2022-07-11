package numeric;

import java.util.Scanner;

public class primenumber {
	public static void main(String[] args) {
		
	
	Scanner s=new Scanner(System.in);
	System.out.println("type number to check its prime or  not");
	int n=s.nextInt();
	
	int c=0;
	
for (int i=1;i<=n;i++)
{
	if(n%i==0)
	{
		c++;
		}

	}
		
if (c==2)
	System.out.println(n+"   number is prime number");
else
System.out.println("number  is not prime");
}
	

	
	
	}
