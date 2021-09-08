package week1.day2;

import java.lang.reflect.Array;

public class FrequencyOfNumber {

	public static void main(String[] args) {
int a[]= {1,3,5,6,1,3,5,1,6,7,8};
int n=a.length;
int[] b= new int[n];
int d=-1;
for(int i=0;i<=n-1;i++) {
	int count=1;
	for(int j=(i+1);j<=n-1;j++)
	{
		if(a[i]==a[j])
		{
			count=count+1;
			b[j]=d;
		}
		
	}
	if(b[i]!=d)
	{
	System.out.println(a[i]+"occurs"+count);	
	}
}
	}
}


