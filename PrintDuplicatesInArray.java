package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] a = { 14,20,11,13,15,14,11 };
		int n = a.length;
		for (int i = 0; i <= n-1; i++) {
			int count = 0;
			for (int j = i + 1; j <= n-1; j++) {
				if (a[i] == a[j]) {

					count = count + 1;
				}
				}
			if (count > 0)
			{
				System.out.println(+a[i]);
			}
		}
	}
}
