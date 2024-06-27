package numberprograms;
//WAP to print the combination (nCr) of the given number

//Combination (nCr) can be defined as the combination of n things taken r at a time without any repetition.
//nCr can be calculated as,
//nCr = [n(n-1) ... (n-r+1)] / r(r-1)...1  

import java.util.Scanner;
public class P14 {
	static int nCr(int n, int r) {
		return fact(n) / (fact(r) * fact(n - r));
	}

	static int fact(int n) {
		int res = 1;
		for (int i = 2; i <= n; i++)
			res = res * i;
		return res;
	}
	public static void main(String[] args) {
		int n, r;
		System.out.println("Enter the value of n and r?");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		r = sc.nextInt();
		System.out.println("nCr = " + nCr(n, r));
	}
}
