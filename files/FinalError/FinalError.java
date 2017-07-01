public class FinalError{
	
	public static void main(String[] args){
		//not compiled
	}
}

class FinalUsage{
	final void test(){
		System.out.println("FinalUsage.test method.");
	}
}

class FinalUsageAnother extends FinalUsage{
	void test(){
		System.out.println("FinalUsage.anotherTest method.");
	}
}