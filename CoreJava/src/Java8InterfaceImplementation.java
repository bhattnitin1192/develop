
public class Java8InterfaceImplementation implements Java8Interface{

	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("Implemented Method");
	}

	public static void main(String...k) {
		Java8Interface j= new Java8InterfaceImplementation();
		j.starty();
		Java8Interface.runny();
		
	}
}
