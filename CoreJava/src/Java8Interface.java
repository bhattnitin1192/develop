
public interface Java8Interface {

	void go();
	default void starty() {
		System.out.println("i its interface default");
	}
	
	default void stopy() {
		System.out.println("i its interface default");
	}
	
	static void runny() {
		System.out.println("Its static method ");
	}
}
