public class Server {
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

