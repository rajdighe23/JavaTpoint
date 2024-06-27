package basicprograms;
//WAP to calculate the surface area of the cylinder

public class P21 {
	public static void main(String args[]) {
		float r, h, surfacearea;
		r = 2;
		h = 5;
		surfacearea = (22 * r * (r + h)) / 7;
		System.out.println("Surface Area of Cylinder is: " + surfacearea);
	}
}
