package program1;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle("Circle",25);
		Square square = new Square("Square",25);
		Rectangle rectangle =new Rectangle("Rectangle", 6, 35);
		System.out.println(circle.calculateArea());
		System.out.println(square.calculateArea());
		System.out.println(rectangle.calculateArea());
	}

}
