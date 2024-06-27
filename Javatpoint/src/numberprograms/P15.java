package numberprograms;
//WAP to print the first 10 prime numbers

public class P15 {
	public static void main(String[] args) {
		int i = 1;
		int count1 = 0;
		while (i > 0) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(i + " ");
				count1++;
			}
			if (count1 == 10) {
				break;
			}
			i++;
		}
	}

}
