package numberprograms;
//WAP to print all Disarium numbers between 1 and 100

public class P4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			int n = i;
			int sum = 0;
			int count = 0;
			while (n > 0) {
				count++;
				n = n / 10;
			}
			n = i;
			while (n > 0) {
				int d = n % 10;
				int pow = 1;
				for (int j = 0; j < count; j++) {
					pow = pow * d;
				}
				count--;
				sum = sum + pow;
				n = n / 10;
			}
			if (sum == i) {
				System.out.print(i + " ");
			}
		}
	}
}
