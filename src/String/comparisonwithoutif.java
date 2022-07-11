package String;

import java.util.Scanner;

public class comparisonwithoutif {public static void main(String[] args) {
//	int x=11;
//	int y=28;
//	
//	boolean p=(x>y);
//	System.out.println(p);
//
//	boolean o=(x<y);
//	System.out.println(o);
//	
//	//using ternarity operator 
//	
//int c=x>y ? x :y;
//System.out.println(+c+ "    its a big number");

Scanner a=new Scanner(System.in);
System.out.println("please print 1st number");
int x=a.nextInt();
System.out.println("print the second number");

int y=a.nextInt();
boolean v=(x>y);
System.out.println("firstnumber is greater than second number------>"+v);
boolean b=(y>x);
System.out.println("second number is greater than first ---->" +b);













}
}
