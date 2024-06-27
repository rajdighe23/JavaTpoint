package numberprograms;
//WAP to determine whether a given number is a twisted prime number.

//A number is called a twisted prime number if it is a prime number and reverse of this number is also a prime number.
//E.g:- 2,3,5,7,11,13,17,31,37,71,73,79,97

public class P9 {
	public static void main(String[] args) {
		int j = 13;
		int a = j;
		int count = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			count = 0;
			int sum = 0;

			while (a > 0) {
				int d = a % 10;
				sum = sum * 10 + d;
				a = a / 10;
			}
			for (int i = 1; i <= sum; i++) {
				if (sum % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(j + " is a twisted prime number.");
			}
		}
	}
}
