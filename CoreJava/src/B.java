
public class B extends A{

	public B() {
		System.out.println("B constructor");
	}
	
	public B(int a) {
		System.out.println("B constructor "+a);
	}
	
	{
		System.out.println("B initializer block");
	}
	
	{
		System.out.println("B second initializer block");
	}
	
	static {
		System.out.println("B static initializer block");
	}
	
	
	public static void main(String...k) {
		//A a=new A();/*
	/*	A static initializer block
		B static initializer block
		A initializer block
		A second initializer block
		A constructor*/
		//B b=new B();
		/*
		A static initializer block
		B static initializer block
		A initializer block
		A second initializer block
		A constructor
		B initializer block
		B second initializer block
		B constructor*/
		
	//	A a=new B();
		A a=new A(1);
		
	}
}
