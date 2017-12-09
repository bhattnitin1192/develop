
public abstract class Abstraction {

	private int i;
	public Abstraction() {
		i=9;
		System.out.println("Default constructor");
	}
	public abstract void go();
	public void fat() {
		System.out.println("Hello world Java"+i);
	};
	
}
