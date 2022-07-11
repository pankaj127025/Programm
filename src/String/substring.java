package String;

public class substring {
	public static void main(String[] args) {
		
		
		String p="Pankajnawale";
		
	
		
		
System.out.println(p.substring(0, 6));
System.out.println(p.subSequence(0, 6));
System.out.println(p.substring(6));


char k[]=p.toCharArray();
for(int i=0;i<6;i++)
{
	System.out.print(k[i]);
}
		
	}

}
