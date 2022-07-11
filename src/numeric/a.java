package numeric;

import java.util.Scanner;

public class a {
	public static void main(String[] args) {
	int rem;
	int result=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Print any number");
int n=s.nextInt();
System.out.println("Print any number");
int n1=s.nextInt();
		
	for(int  i=n;i<=n1;i++)
		{
			while(n>0){
				
			
			rem=i%10;
			result=result*10+rem;
			i=i/10;
			}
			System.out.println(result);
		}
		
	
		
	

	}}
