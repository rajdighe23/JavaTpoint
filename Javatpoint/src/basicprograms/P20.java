package basicprograms;
//WAP to calculate the surface area of cuboid

public class P20 {
	public static void main(String args[]) {
		float l, w, h, surfacearea;
		l = 2;
		w = 3;
		h = 5;
		surfacearea = 2 * (l * w + w * h + h * l);
		System.out.println("Surface Area of Cuboid is:  ");
		System.out.println(surfacearea);
	}
}
