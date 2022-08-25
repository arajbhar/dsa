package handson;

public class FinalDemo {
	
	public final void display() {
		System.out.println("Hello");
	}
	
	

}

class Sub extends FinalDemo {
	
	public void subDisplay() {
		System.out.println("Sub");
	}
	
}


class TestC {
	
	public static void main(String[] args) {
		Sub s = new Sub();
		s.display();
		s.subDisplay();
	}
}
