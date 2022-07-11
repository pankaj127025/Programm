package String;

public class stringbuffer {
public static void main(String[] args) {
	String b="p2p3p4o4";
	
StringBuffer a=new StringBuffer(),
n=new StringBuffer(),
sc=new StringBuffer(),
m=new StringBuffer(a.append(n));
for (int i=0;i<b.length();i++)
	if (Character.isDigit(b.charAt(i)))
		a.append(b.charAt(i));
 else  if 
	(Character.isAlphabetic(b.charAt(i)))
n.append(b.charAt(i));
else
	sc.append(b.charAt(i));
System.out.println(a);
System.out.println(n);
System.out.println(sc);
	System.out.println(m);
	

//System.out.println(a.append(n));

//String v=a.append(n);

System.out.println(m);

System.out.println(m.toString());

m.toString();
}
}
