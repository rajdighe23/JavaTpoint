package numberprograms;
//WAP to determine whether a given number is an abundant number

//The abundant number can be called as an excessive number and defined as the number for which 
//the sum of its proper divisors is greater than the number itself.
//E.g:-12,18,20,24,30,36,..etc

public class P8 {
	public static void main(String[] args) {
		int a = 12;
		int sum = 0;
		for (int j = 1; j < a; j++) {
			if (a % j == 0) {
				sum = sum + j;
			}
		}
		if (sum > a) {
			System.out.print(a + " is a abundant number.");
		}
	}
}
