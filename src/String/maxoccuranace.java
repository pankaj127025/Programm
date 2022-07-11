package String;

public class maxoccuranace {
	public static void main(String[] args) {
		String p="abbtrgdfgdfb";
	   char c=' ';
	    int max=-1;
	    int a[]=new int[256];
		
	    for(int i=0;i<p.length();i++)
             
	    {a[p.charAt(i)]=a[p.charAt(i)]+1;}
		
	    for(int i=0;i<p.length();i++)
   	    
    
      {
    	  if(max<a[p.charAt(i)])
    	  {
    		  max =a[p.charAt(i)];
    				  c=p.charAt(i);
    		     
    	  }
   
      }
 	  System.out.println("max occurance character is   "+c );

      
 
	}	
	
	}

	


