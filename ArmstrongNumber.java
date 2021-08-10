package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 153;
		int remainder;
		int calculated = 0; 
		int org = i;
		while (i > 0) {		
			remainder = i%10;		
			calculated = calculated + (remainder * remainder * remainder);
			i = i/10;
		}
		System.out.println(calculated);
		System.out.println(org);
		if (org == calculated) 
			System.out.println("The number is an Armstrong number");
		 else 
			System.out.println("The number is not an Armstrong number");
	}
}
