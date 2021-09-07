package week1.day2;

public class AmstrongNo {
	int n , m, q = 0, r = 0, sum = 0;

	public void calculate(int n) {
		m = n;
		while (m != 0)
		{
		q = m / 10;
		r = m % 10;
		sum=sum+(r*r*r);
		m=q;
		}
		if(n==sum)
		{
			System.out.println(n + " is an Amstrong number");
		}
		else {
			System.out.println(n + " is Not amstrong number");
		}
	
	}
	

	public static void main(String[] args) {
		AmstrongNo obj =new  AmstrongNo();
		obj.calculate(153);
		obj.calculate(185);

}

}
