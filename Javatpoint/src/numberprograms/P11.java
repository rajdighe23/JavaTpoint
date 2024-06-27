package numberprograms;
//WAP to print all Kaprekar numbers between 1 to 100

//A non-negative integer having base(10) is said to be the Kaprekar number if the representation of its square in its base 
//can be split into two parts that add up to the original number, with the condition that the part
//formed from the low-order digits of the square must be non-zero-however, it is allowed to include leading zeroes.

public class P11 {
	static boolean kaprekar(int n) {
		if (n == 1)
			return true;
		int sq = n * n;
		int count = 0;
		while (sq != 0) {
			count++;
			sq = sq / 10;
		}
		sq = n * n;
		for (int i = 1; i < count; i++) {
			int eq_parts = (int) Math.pow(10, i);
			if (eq_parts == n)
				continue;
			int sum = sq / eq_parts + sq % eq_parts;
			if (sum == n)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++)
			if (kaprekar(i))
				System.out.print(i + " ");
	}
}
