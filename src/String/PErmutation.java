package String;

public class PErmutation {
	public static void main(String[] args) {

		
		
	String p="hello hello hello pankaj dfdf dvdv dsffd";
	String h="hello";
	p=p.toLowerCase();
	int count =0;
	String v[]=p.split(" ");
	
	for (int i=0;i<=v.length-1;i++)
	{
		if (v[i].equals(h))
		{
			count ++;
			}
		
	}
	
	
if(count==0)
{
	System.out.println("hello not present in given sentance");
}
else 
{
	System.out.println("hello  present in given sentance");
	System.out.println("repation is "+ count);
}
	
	//System.out.println(count);
	
	
	
	
	
	
	}

}
