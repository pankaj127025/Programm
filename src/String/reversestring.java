package String;

public class reversestring {
	public static void main(String[] args) {
//		String k="aba";
//		char v;
//		String m="";
//		String act=k;
//		for (int i=0;i<k.length();i++)
//		{
//			v=k.charAt(i);
//					
//			m=v+m;
//			System.out.println(m);
//					
//		if (act==m)
//			System.out.println("string is pelindrom ");
//		else
//			System.out.println("string is not pelindrom ");}
		String v="adfda";
		String f ="  ";
		
		String o=v;
		char r;
		for(int i=0;i<=v.length()-1;i++)
		{
			r=v.charAt(i);
			f=r+f;
			System.out.println(f);
		}
		System.out.println(f);
		if(f.equals(o))
			System.out.println("string is pelindrom ");
		else
		
		System.out.println("String is not pelindrom ");
		
		
		
		
		
		
		
		

	}
}
