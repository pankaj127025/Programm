package String;

public class nonrepetativechar { 
public static void main(String[] args) {
	String v="EVERYTHING";
	v=v.toLowerCase();
	char[]p=v.toCharArray();
	
	for (int i=0;i<=p.length-1;i++)
	{
		for(int j=i+1;j<=p.length-1;j++)
			if(p[i]==p[j])
			{
				System.out.println("duplicate "+p[j]);
				}
			
				
	}
}

}
