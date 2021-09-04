package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		
int n=1850;
int i=2;
if(n%i!=0) {
		i++;
		System.out.println("its is an prime number" +i );
}
	else if(n==0) {
		System.out.println("It is 0");
	}
	else {
		System.out.println("not prime number");
	}
	

}
}