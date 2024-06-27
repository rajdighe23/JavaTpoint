package basicprograms;
//WAP to convert Fahrenheit into Celsius

public class P13 {
	public static void main(String args[]) {
		float Fahrenheit, Celsius;
		Fahrenheit = 43;
		Celsius = ((Fahrenheit - 32) * 5) / 9;
		System.out.println("Temperature in celsius is: " + Celsius);
	}
}
