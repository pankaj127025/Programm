package String;

import java.util.Scanner;

public class practise {
	public static void main(String[] args) {
//		Scanner o=new Scanner(System.in);
//		System.out.println("Type   String ");
//		String g=o.next();
//		char u;
//		String s="";
//		
//		for (int i=0;i<g.length();i++)
//		{
//			u=g.charAt(i);
//			s=u+s;
//			
//		}
//		
//		System.out.println(s);
		
		Scanner s= new Scanner (System.in);
		System.out.println("print any string ");
		String j=s.next();
		System.out.println(j);
		int i;
	String m=j.toLowerCase(); 
		String []v=m.split(" ");
		
		
		
		for( i=0;i<v.length;i++)          
		{
			System.out.println(v[i]);
		}
		for (i=0;i<v.length;i++);
		{
			for (int k=i+1;k<v.length;k++)
			{
				if (v[i].equals(v[k]))
				{
					System.out.println("duplicate word in String     "+  v[k]);
				}
			}
		}
		
		
		
		
		
		
		
	}

}
