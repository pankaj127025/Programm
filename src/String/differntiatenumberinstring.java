package String;

public class differntiatenumberinstring {
public static void main(String[] args) {
String a="dkkhj3hj2hj32h2j3h32@/";
	// 1. three empty string created with the help og stringbuffer class
 StringBuffer  alphabets = new StringBuffer(),
		 // use ,
		       numbers = new StringBuffer(),
               specialchar = new StringBuffer();
               
// for loop 
for (int i=0; i<a.length(); i++)
{
    if (Character.isDigit(a.charAt(i)))  //      use character class is digit method to check its number or not
    	
        numbers.append(a.charAt(i));   // numbers is string and concat=append (in string buffer)
    
    else if(Character.isAlphabetic(a.charAt(i))) //use character class is alphabates  method to check its alphabates or not
    	
        alphabets.append(a.charAt(i));      // alphates is string and concat=append (in string buffer)
    else
        specialchar.append(a.charAt(i));  //special char is string and concat=append (in string buffer)
}

   System.out.println(alphabets); // print alphabates
System.out.println(numbers);   // print numbers
System.out.println(specialchar); // print special char 


//StringBuffer  r = new StringBuffer("hiiii");
//System.out.println(r.reverse());
}}

