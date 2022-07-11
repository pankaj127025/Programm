package array;

import java.util.Scanner;

public class desce {
	public static void main(String[] args) {
		int a[]=new int[5];     
		int v;
		int i;
	Scanner s=new Scanner(System.in);
System.out.println("print 5 number ");
for( i=0;i<a.length;i++)
{ a[i]=s.nextInt();}

	 for( i=0;i<a.length;i++)
	 {
		 for(int j=i+1;j<a.length;j++)
		 {
			 if (a[i]<a[j])
			 {
			     v=a[i];
				a[i]=a[j];
				a[j]=v;	 
				


				
			 }
				 
		 }
		
			 
	 }
	
	 
	 for( i=0;i<a.length;i++)
	 {
		 System.out.print(a[i]+" ");
	 }
}
	}

