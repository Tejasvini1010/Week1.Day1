package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 8;
		int n1 = 0;
		int n2 = 1;
		int sum;
		System.out.println("The fibonacci series :\n" + n1 +" \n" +n2);
		for (int i = 0; i < range; i++) {
			sum = n1+n2;
			n1 = n2;
			n2=sum;
			System.out.println(sum);
		}
		
	}

}
