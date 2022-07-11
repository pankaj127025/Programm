package array;

public class max {public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int max=a[0];
	int i;
	for( i=0;i<=a.length-1;i++)
	{
		if(max<a[i])
		{
			max=a[i];
		}
	}
	System.out.println("max value is   "+max);
	
	
	
	
}

}
