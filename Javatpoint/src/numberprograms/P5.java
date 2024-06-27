package numberprograms;
//WAP to print all happy numbers between 1 and 100

public class P5 {
	public static void main(String[] args) {
		for (int a = 1; a <= 100; a++) {
			int temp=a;
			while (temp != 1 && temp != 4) {
				int sum = 0;
				int sq = 1;
				while (temp > 0) {
					int d = temp % 10;
					sq = d * d;
					sum = sum + sq;
					temp = temp / 10;
				}
				temp = sum;
			}
			if (temp == 1) {
				System.out.print(a+" ");
			} 
		}
	}
}
