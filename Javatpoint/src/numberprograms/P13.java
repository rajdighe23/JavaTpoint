package numberprograms;
//WAP to print the average of n numbers

import java.util.Scanner;

public class P13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			sum = sum + a;
		}
		int avg = sum / n;
		System.out.println(avg);

	}
}
