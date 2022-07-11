package giris;

import java.util.Scanner;

public class maxnumberinarray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("print");
		int a[]=new int[5];
		int max=0;
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<=a.length-1;i++)
		{
		if(max<a[i])
		{
			max=a[i];
		}
		}
	
	System.out.println(max);
	
	

}
}
