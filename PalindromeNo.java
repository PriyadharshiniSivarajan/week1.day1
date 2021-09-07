package week1.day2;

public class PalindromeNo {

	public static void main(String[] args) {
		int n= 111,sum=0,r=0,q=0;
		int m=n;
	   while(m!=0) {
		   r=m%10;
		   q=m/10;
		   sum=(sum*10)+r;
		   m=q;
	   }
	   
	   if(sum==n)
	   {
		  System.out.println("The given is palindrome" +n);
		 
	   }
	   else {
		   System.out.println("Not palindrome"+n);
	   }
	   }

	}

