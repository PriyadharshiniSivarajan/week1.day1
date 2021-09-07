package week1.day2;

public class AmstrongNumber {

	public static void main(String[] args) {
		int n = 153, q = 0, r = 0, m;
		m = n;
		int sum = 0;
		while (m != 0) {
			
			q = m / 10;
			r = m % 10;
			sum = sum + (r * r * r);
			m = q;
		}

		System.out.println(+sum);
		if (n == sum) {
			System.out.println("the number is amstrong");
		} else {
			System.out.println("No an amstrong no");
		}
	}
}
