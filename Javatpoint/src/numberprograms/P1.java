package numberprograms;
//WAP to determine whether a given number is a Disarium number

//A number is said to be the Disarium number when the sum of its digit raised to the power of their respective positions 
//is equal to the number itself. 
//E.g:-175,89,518,etc.

public class P1 {
	public static void main(String[] args) {
		int a = 518;
		int count = 0;
		int temp = a;
		int sum = 0;
		while (a > 0) {
			count++;
			a = a / 10;
		}
		a = temp;
		while (a > 0) {
			int d = a % 10;
			int pow = 1;
			for (int i = 0; i < count; i++) {
				pow = d * pow;
			}
			count--;
			sum = sum + pow;
			a = a / 10;

		}
		if (sum == temp)
			System.out.println(temp + " is a disarium number");
		else
			System.out.println(temp + " is not a disarium number");

	}
}
