package numberprograms;
//WAP  to print the sum of digits without using modulus

import java.util.Scanner;

public class P17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number?");
		String str = sc.nextLine();
		char[] n = str.toCharArray();
		int sum = 0;
		for (int i = 0; i < n.length; i++) {
			sum = sum + ((int) n[i]);
			sum = sum - 48;
		}
		System.out.println("sum of digits: " + sum);
	}
}
