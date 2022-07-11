package String;

public class conditionalseparet {
	public static void main(String[] args) {
		
	String s="Roses are red violet are blue , orange is orange ";
		// differentiate two are & two orange 
	
	int i;
	int j;
	s=s.toLowerCase();  // convert the String lowercase 
	String  w[]=s.split(" ");    //  Convert String to String array  by using split method 
	
	// to cheack String converted to String array or not 

	for( i=0;i<w.length;i++)          
		{System.out.println(w[i]);
		}
	// duplicate array programm
		
		// System.out.println("duplicate word in String ");
	for( i=0;i<w.length;i++)
	{
		for ( j=i+1;j<w.length;j++)
		{
		//	if(w[i]==w[j]) // for number == used 
				if(w[i].equals(w[j]))    //for String comparison .equal method is used
				System.out.println("the duplicate number is "+w[j]);
		}
	}

		}
			
	}


