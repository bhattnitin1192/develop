
public class AbstractioImplemtation extends Abstraction{

public static void main(String...k) {
	Abstraction a= new AbstractioImplemtation();
	a.go();
	a.fat();
}

@Override
public void go() {
System.out.println("Go in abstractionImplemetations");	
}
}
