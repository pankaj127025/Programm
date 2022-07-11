package String;

import java.util.Scanner;import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class p {
	

	public static void main(String[] args) {
		
		String h="Pankaj@123";
		 StringBuffer alphabet=new StringBuffer();
		 StringBuffer	 numeric =new StringBuffer();
				 StringBuffer	 special=new StringBuffer();
		
			System.out.println(alphabet);
			System.out.println(numeric);
			System.out.println(special);
		 for (int i=0;i<=h.length()-1;i++)
		 {
			 if(Character.isAlphabetic(h.charAt(i)))
				 alphabet.append(h.charAt(i));
			 
			 
			 else if(Character.isDigit(h.charAt(i)))
				 numeric.append(h.charAt(i));
			 else 
				special.append(h.charAt(i));
			
			 
		 }
		 
		 
		 
		 
			System.out.println(alphabet); 
			System.out.println(numeric);
			System.out.println(special);
			 
		 
		
	}

}
