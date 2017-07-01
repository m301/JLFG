public class ConstructorOverloading{
	public static void main(String args[]){
			System.out.println("\nWith 1 int param");
			(new Server(80)).print();
			System.out.println("\nWith 1 String param.");
			(new Server("c:\\")).print();	
	}
}

class Server {
	int port;
	String path;
	public Server(){
		
	}
	
	public Server(int port){
		this.port  = port;
		
	}
	
	public Server(String path){
		this.path = path;
	}
	
	public Server(String path, int port){
		this.port = port; 
		this.path = path;
	}
	
	public Server(ServerConfig serverConfig){
		this.port = serverConfig.port;
		this.path = serverConfig.path;
	}
	
	public void print(){
			System.out.println("Server's Port is "+port);
			System.out.println("Server's Path is "+path);
	}
}

class ServerConfig{
	//default constructor is being called.
	public int port; //set to 0
	public String path; //set to null
	
	public void print(){
		System.out.println("Port is "+port);
		System.out.println("Path is "+path);
	}
}

