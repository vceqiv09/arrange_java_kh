package inherit.exam.shape;

public class InheritExam_Shape {

	public static void main(String[] args) {
		/*
		 * 도형 클래스를 상속하는 삼각형, 사각형 클래스를 작성하시오.
		 * 
		 * 	삼각형, 사각형 클래스는 다음의 멤버 변수와 메서드가 필요하다.
		 * 		- 삼각형
		 * 			멤버 변수 : 가로길이, 세로길이 
		 * 			멤버 메서드 : 넓이구하기
		 * 		- 사각형
		 * 			멤버 변수 : 가로길이, 세로길이
		 * 			멤버 메서드 : 넓이구하기
		 */
		
		Triangle tri = new Triangle();
		tri.setWidth(10);
		tri.setHeight(10);
		System.out.println(tri.getWidth() +" "+ tri.getHeight() +" "+ tri.getArea());
		
		Square squ = new Square();
		squ.setWidth(10);
		squ.setHeight(10);
		System.out.println(squ.getWidth() +" "+ squ.getHeight() +" "+ squ.getArea());
		
	}

}