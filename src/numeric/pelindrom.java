package numeric;

import java.util.Scanner;

public class pelindrom {
	

public static void pp()
{
	
}
	
	
	
	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		System.out.println("checks its prlindrom or not ");
//	int n=s.nextInt();
//	int v=n;
//	int reminder=0;
//	int result=0;
//	
//	while(n>0)
//	{
//		reminder=n%10;
//		result=result*10+reminder;
//		n=n/10 ;
//	}
//	if 
//	(result==v)
//		System.out.println("number is pelindrop");
//	else
//		System.out.println("number is not pelindrom");
		int i;
		Scanner s=new Scanner(System.in);
System.out.println("type lower limit ");
    int result=0;
    int rem;
		int N1=s.nextInt();
		System.out.println("type upper limit ");
		int N2=s.nextInt();

 

		for(i=N1;i<=N2;i++)
		{
	while(i>0)
	{
		rem=i%10;
		
		result=result*10+rem;
		
		i=i/10;

		
	}
		}
System.out.println(i);
System.out.println(result);
		{if (i==result)
System.out.println(i+"  number is pelindrom");
		else 
	
	System.out.println(i+"  number is not pelindrom ");
		}
	}
		
	}

	
