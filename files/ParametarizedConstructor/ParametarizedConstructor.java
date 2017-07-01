public class ParametarizedConstructor{
	public static void main(String args[]){
	
			System.out.println("Non parametarized");
			(new Server()).print();;
			System.out.println("\nParametarized with 1 param.");
			(new Server(80)).print();
			System.out.println("\nParametarized with 2 param.");
			(new Server("c:\\",80)).print();
	}
}
