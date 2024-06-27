package numberprograms;
//WAP to swap two numbers without using the third variable

public class P19 {
	public static void main(String[] args) {
		int a=3;
		int b=9;
		System.out.println(a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
	}
}
