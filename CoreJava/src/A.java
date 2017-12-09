
public class A {

	public A() {
		System.out.println("A constructor");
	}
	
	
	public A(int b) {
		System.out.println("A constructor "+b);
	}
	{
		System.out.println("A initializer block");
	}
	
	{
		System.out.println("A second initializer block");
	}
	
	static {
		System.out.println("A static initializer block");
	}
}
