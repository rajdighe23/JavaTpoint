package numberprograms;
//WAP to print all Pronic numbers between 1 and 100

//The pronic number can be defined as the number which is a product of two consecutive numbers.
//Mathematically, the Pronic number can be represented as N*(N + 1)
//E.g:-2,6,12,20,..etc.

public class P6 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			for (int j = 1, k = j + 1; j < i; j++, k++) {
				if (j * k == i) {
					System.out.print(i + " ");
					break;
				}
			}
		}
	}
}
