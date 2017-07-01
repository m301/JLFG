//PRogram for FileWriter

import java.io.*;

class writer1{
	public static void main(String[] args){
		try{
			boolean newFile=false;
			File file=new File("filewriter1.txt");
			System.out.println(file.exists());
			newFile= file.createNewFile();
			System.out.println(newFile);
			System.out.println(file.exists());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}