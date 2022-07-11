package array;

import java.util.Scanner;

public class duplicate {
	public static void main(String[] args) {
		
		
		
		// duplicate with scanner class 
		int a[]=new int  [5];
		Scanner s=new Scanner(System.in);
		System.out.println("give the number");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					System.out.println("the duplicate number is "+a[j]);
			}
		}
 
 
 
 
 
 
 // without scanner class 
 
 
 
 
 
// 
//		//int a[]= {1,2,1};
//		for(int i=0;i<=a.length-1;i++)
//		{
//			
//			for(int j=i+1;j<=a.length-1;j++)
//			{
//				if (a[i]==a[j])
//					System.out.print(a[j]);
//			}
		//}
	}

}
