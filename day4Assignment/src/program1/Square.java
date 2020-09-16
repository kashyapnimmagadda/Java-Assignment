package program1;

public class Square extends Shape{
		private int side;
		public Square(String name, int side){
			super(name);
			this.side=side;
		}
		public void setName(String name){
			this.name=name;
		}
		public String getName(){
			return name;
		}
		public void setSide(int side){
			this.side=side;
		}
		public int getSide(){
			return side;
		}
		public float calculateArea(){
			float area= side*side;
			return area;
		}
}
