package array;

public class min {
	public static void main(String[] args) {
		int a[]= {2,9,8,7,6,6,5,5,4,4};
		
		int min=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if (min>a[i])
			{
				min=a[i];
			}
			
		}
	System.out.println("min value  "+min);
	
	
	}
	

}
