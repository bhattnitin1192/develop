
class Check {

	public Check(int x) {

	}
	

}

public class ConstructorIni extends Check {

	int x=1;
	static int y=2;
	public ConstructorIni() {
     //  super(x);
       //super(ConstructorIni.y);
       //super(ConstructorIni.go2());
       super(go());
       
	}
int go() {
	return 1;
}

static int go2() {
	return 2;
}
}
