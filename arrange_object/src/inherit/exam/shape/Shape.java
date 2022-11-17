package inherit.exam.shape;

public class Shape {
	private double width;
	private double height;
	
	public double getWidth() {
		return this.width;
	}
	public double getHeight() {
		return this.height;
	}
	public double getArea() {
		return this.width * this.height;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
}