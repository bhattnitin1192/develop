

enum CoffeeSize{BIG(1),HUGE(2),OBERWHELMING(3){
	public int getSize() {
	System.out.println("inner method");
	return 5;
}};
		private int size;
	CoffeeSize(int size) {
		System.out.println("This is enum constructor for size "+size);
		this.size=size;
	}
	
	public int getSize() {
		return size;
	}
	};
	
public class EumExample {

	private CoffeeSize coffee;
	
	public static void main(String...k) {
		EumExample e1=new EumExample();
		e1.coffee=CoffeeSize.BIG;
	
		
		EumExample e2=new EumExample();
		e2.coffee=CoffeeSize.OBERWHELMING;
	
		System.out.println(e1.coffee.getSize());
		
		for(CoffeeSize c : CoffeeSize.values()) {
			System.out.println(c.name()+" The coffee size is "+c.getSize()+" Ordinal "+c.ordinal());
		}
//		CoffeeSize c1=CoffeeSize.BIG;
		
		//System.out.println(c1);
	}
}
