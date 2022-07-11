package String;

public class vovels {
	
public static void main(String[] args) {
	String p="welcome";

	char []v=p.toCharArray();
	char []c=  {'a','e','i','o','u'};
	int b=0;

	for (int i=0;i<v.length;i++)
		for (int j=0;j<c.length;j++)
		{
			if (v[i]==c[j])
			{
				b++;			}
		}
	if (b>0)
	{
		System.out.println("Atleast one vovel is present ");
		System.out.println("total number of vovels is "+b);
	}
	
	
	
	
	
	
	
	
	
	
}

}
