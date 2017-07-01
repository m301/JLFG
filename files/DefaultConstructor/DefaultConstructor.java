public class DefaultConstructor{
	public static void main(String args[]){
			System.out.println("Default constructor");
			ServerConfig sc = new ServerConfig();
			sc.print();
			sc.port = 80;
			sc.path="c:\\sec\\";
			System.out.println("After manually updating value.");
			sc.print();
		
	
	}
}
