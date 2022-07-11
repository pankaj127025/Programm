package String;

public class countthenumberofString {
	public static void main(String[] args) {
		int v=0;
		String a="p a nkaj";
		
		
		
	for (int i=0;i<a.length();i++)
		{
		if((a.charAt(i)==' ') &&(a.charAt(i+1)!=' '));
		{  
			v++;
		}
		
		}
	System.out.println(v);

	}

}
