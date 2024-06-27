package numberprograms;
//WAP to determine whether a given number is a happy number

//The happy number can be defined as a number which will yield 1 when it is replaced by the sum of the square of its digits
//repeatedly. If this process results in an endless cycle of numbers containing 4, then the number is called an unhappy number.
//E.g:=7,32,520,...etc.

public class P2 {
	public static void main(String[] args) {
		int a = 32;

		while (a != 1 && a != 4) {
			int sum = 0;
			int sq = 1;
			while (a > 0) {
				int d = a % 10;
				sq = d * d;
				sum = sum + sq;
				a = a / 10;
			}
			a = sum;
		}
		if (a == 1) {
			System.out.println("Happy number");
		} else if (a == 4) {
			System.out.println("Unhappy number");
		}
	}
}
