package array;

import java.util.Scanner;

public class ascedingorder {
public static void main(String[] args) {
	int a[]=new int [5];
	int v;
	int i;
	Scanner s=new Scanner (System.in);
	System.out.println("print the array for asce order ");
	for ( i=0;i<a.length;i++)
	{
		a[i]=s.nextInt();
	}
	 for(i=0;i<a.length;i++)
	 {
		 for(int j=i+1;j<a.length;j++)
		 {
			 if (a[i]>a[j])
			 {	
		
				 a[i]=a[i]+a[j];
				 a[j]=a[i]-a[j];     // swiping logic without third variable 
				 a[i]=a[i]-a[j];
//				 v=a[i];
//			 a[i]=a[j];  // swiping logic without third variable v 
//			 a[j]=v;
			 }
			 		 }
	 }
	 
	 
	 for ( i=0;i<a.length;i++)
	 {
		 System.out.println(a[i]+"  ");
	 }
}

}
