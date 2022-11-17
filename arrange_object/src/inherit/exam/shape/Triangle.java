package inherit.exam.shape;

public class Triangle extends Shape{

	@Override
	public double getArea() {
		return super.getArea() / 2;
	}
	
}