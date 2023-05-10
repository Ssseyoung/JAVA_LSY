package Day08.Ex01_Shape;

public class Rectangle extends Shape{
	
	double width;
	double height;
	
	public Rectangle() {
		this(0, 0);
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	@Override
	double area() {
		return width * height;
	}
	
	@Override
	double round() {
		return (width + height) * 2;
	}
	
	public double getWeight() {
		return width;
	}

	public void setWeight(double weight) {
		this.width = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	
	
	

}
