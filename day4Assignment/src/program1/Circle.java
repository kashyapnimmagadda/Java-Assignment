package program1;

public class Circle extends Shape{
	private int radius;
	public Circle(String name,int radius){
		super(name);
		this.radius=radius;
	}
	public void setName(String name){
		this.name= name;
	}
	public String getName(){
		return name;
	}
	public void setRadius(int radius){
		this.radius=radius;
	}
	public int getRadius(){
		return radius;
	}
	public float calculateArea(){
		float area= 3.14f*radius*radius;
		return area;
	}
}
