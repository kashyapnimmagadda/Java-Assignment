package program9;

public class Test {

	public static void main(String[] args) {
		Parent p = new Parent();
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		System.out.println(c1 instanceof Parent);
		System.out.println(c2 instanceof Parent);
		System.out.println(p instanceof Child1);
		System.out.println(p instanceof Child2);
		p = c1;
		System.out.println(p instanceof Child1);
		System.out.println(p instanceof Child2);
		p = c2;
		System.out.println(p instanceof Child1);
		System.out.println(p instanceof Child2);

	}

}
