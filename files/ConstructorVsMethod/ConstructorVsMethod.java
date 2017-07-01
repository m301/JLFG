public class ConstructorVsMethod{
	public static void main(String args[]){
			System.out.println("Constructor vs Method\n");
			ServerHandler s= new ServerHandler();
			System.out.println("\nCalling method print().");
			s.print();	
	}
}

class ServerHandler{
	ServerHandler(){
		System.out.println("This is contructor called automatically.");
	}
	
	void print(){
		System.out.println("This is explicitly called by program.");
	}
	
}
