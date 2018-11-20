
public class Rectangle {
	private double width;
	private double height; 
	private double area; 
	
	public Rectangle() {
		width = 10;
		height = 10;
		setArea(10,10); 
	}
	public Rectangle(double width, double height) {
		setWidth(width);
		setHeight(height); 
		setArea(width, height); 
	}
	public void setWidth(double w) {
		if (w > 0) {
			width = w; 
		}
		else {
			width = 10;
			System.out.println("Your width can't be negative/zero! Defaulting to 10");
		}
		setArea(width, height);
	}
	public void setHeight(double h) {
		if (h > 0) {
			height = h; 
		}
		else {
			height = 10;
			System.out.println("Your height can't be negative/zero! Defaulting to 10");
		}
		setArea(width, height);
	}
	public double getWidth() {
		return width; 
	}
	public double getHeight() {
		return height; 
	}
	public void setArea(double height, double width) {
		area = height * width;
	}
	public double getArea() {
		return area; 
	}
	
	public String toString() {
		return "The rectangle's dimensions are:" + width + "ft by " + height +
				"ft"; 
	}
	
	}


