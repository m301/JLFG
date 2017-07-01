import java.io.*;

class FileHandling{
	public static void main(String args[]){
		char[] in=new char[30];
		int size=0;
		try{
			File direx=new File("Direx.txt");
			direx.mkdir();
			
			if(direx.exists()){
				System.out.println("The directory already exists");
				
				File file=new File(direx,"Human.txt");
				file.createNewFile();
				
				FileWriter fw=new FileWriter(file);
				BufferedWriter bw=new BufferedWriter(fw);
				bw.write("Test content.");
				bw.flush();
				bw.close();
				
				FileReader fr=new FileReader(file);
				BufferedReader br=new BufferedReader(fr);
				size=br.read(in);
				System.out.println(size);
				
				for(char c:in){
					System.out.print(c);
				}
			}else{
				System.out.println("Sorry this directory does not exist");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}	

}
