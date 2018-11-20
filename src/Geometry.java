
public class Geometry {

	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(12.5, 11);
		rect2.setHeight(-11);
		System.out.println("Rectangle 1: " + rect1 + " has an area of " + rect1.getArea() + " sq ft");
		System.out.println("Rectangle 2: " + rect2 + " has an area of " + rect2.getArea() + " sq ft");

	}

}
