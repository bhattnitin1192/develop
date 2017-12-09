package com.nitin.inheritence;

public class PlayerPeice extends Gameshape implements Animatable{

	@Override
	public void mover() {
 System.out.println("Interface method");		
	}
	
	public void doShape() {
		System.out.println("child class method");
	}
	
	public void x() {
		System.out.println("Child class own mehod");
	}
	
	
	private void coop() {
		System.out.println("Private method form child");
	}
	
	public static void main(String...k) {
		PlayerPeice playerPeice = new PlayerPeice();
		Object o=playerPeice;
		Animatable a= playerPeice;
		Gameshape g= playerPeice;
		
		//((PlayerPeice) a).doShape();
		Gameshape g1= new PlayerPeice();
//g1.x();
		
	    try {
			g1.doShape();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		playerPeice.coop();
		
		
		
	}

}
