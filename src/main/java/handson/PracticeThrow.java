package handson;

class NegativeDimensionException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString() {
		return "Dimensions should not be negative";
	}
	
}

public class PracticeThrow {
	
	static int area(int l,int b) throws NegativeDimensionException {
		
		if(l<0 || b<0) {
			throw new NegativeDimensionException();
		}
		
		return l*b;
		
	}
	
	static int meth1() throws NegativeDimensionException{
		return area(-10,5);
	}
	
	public static void main(String[] args) {
		
		try {
			int r=meth1();
			System.out.println(r);
		} catch (NegativeDimensionException e) {
			// TODO Auto-generated catch block
			System.out.println(e);;
		}
		
	}

}
