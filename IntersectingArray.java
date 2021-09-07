package week1.day2;

public class IntersectingArray {

	public static void main(String[] args) {
int[] a= {1,2,3,4,5,6,7};
int[] b= {2,3,6,9,10,11,15,16};
for(int i=0;i<=(a.length)-1;i++)
{
	for(int j=0;j<=(b.length)-1;j++) {
		if(a[i]==b[j])
		{
			System.out.println("The intesectiing numbers are:"+a[i]);
		}
	}
}
	}

}
