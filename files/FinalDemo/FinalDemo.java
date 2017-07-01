public class FinalDemo{
	
	public static void main(String[] args){
		FinalUsage f = new FinalUsage();
		FinalUsageAnother fa = new FinalUsageAnother();
		System.out.println("FinalUsage Value : "+f.UPPER_CHAR);
		System.out.println("FinalUsageAnother Value : "+fa.UPPER_CHAR);
		System.out.println("\nNormal method call.");
		f.test();
		System.out.println("Method call which uses super.");
		fa.anotherTest();
	}
}


class FinalUsage{
	//this can be overriden, but can't be modified.
	final int UPPER_CHAR = 'A';
	//this can't be overriden.
	final void test(){
		System.out.println("FinalUsage.test method.");
	}
	
	//called by GC
	protected void finalize() throws Throwable{
		System.out.println("Finalize called.");
	}
}

class FinalUsageAnother extends FinalUsage{
	
	final int UPPER_CHAR= 'B';
	void anotherTest(){
		//a test for super.
		super.test();
		System.out.println("FinalUsage.anotherTest method.");
	}
}