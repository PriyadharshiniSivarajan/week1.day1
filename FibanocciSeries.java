package week1.day1;

public class FibanocciSeries {

	public static void main(String[] args) {

		int n=10,firstNumber=0, secondNumber=1;
		System.out.println("The fibonacci series is \n"  +firstNumber + "\n"  +secondNumber);
		for(int i=1;i<=n;i++)
		{
			int sum;
			sum=firstNumber+secondNumber;
			System.out.println(+sum);
			firstNumber=secondNumber;
			secondNumber=sum;
			
		}
	}

}

