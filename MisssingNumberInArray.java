package week1.day2;

public class MisssingNumberInArray {

	public static void main(String[] args) {
		int a[] = { 0, 1, 2, 3, 4, 5, 7, 8, 9, 10 };
		int n = a.length;
		for (int i = 0; i <= n; i++) {
			if (i != a[i]) {
				System.out.println(+i);
				break;
			}

		}

	}

}
