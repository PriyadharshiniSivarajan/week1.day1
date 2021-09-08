package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		
int n=151;
if(n==1) {
	System.out.println("Neither Prime nor composite");
}
int count=0;
if(n>1) {
	for(int i=2;i<=n;i++)
	{
	if(n%i==0) {
		count++;
	}
	}
	if(count>2)
	{
		System.out.println("Not Prime number");
	}
	else
		System.out.println("Prime Number");
}
}
}
