package numberprograms;
//WAP to determine whether a given number is a Deficient number.

//The deficient number can be defined as the number for which the sum of the proper divisors is lesser than the number itself.
//E.g:-21,23,..etc.

public class P7 {
	public static void main(String[] args) {
		int j = 21;
		int sum = 0;
		for (int i = 1; i < j; i++) {
			if (j % i == 0) {
				sum = sum + i;
			}
		}
		if (sum < j) {
			System.out.println(j+" is a deficient number.");
		}
	}
}
