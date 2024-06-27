package numberprograms;
//WAP to check if the number is Harshad number or not.

public class P3 {
	public static void main(String[] args) {
		int n = 156;
		int temp = n;
		int sum = 0;
		while (n > 0) {
			int d = n % 10;
			sum = sum + d;
			n = n / 10;
		}
		if (temp % sum == 0) {
			System.out.println("Harshad number");

		} else {
			System.out.println("Not a harshad number");
		}
	}

}
