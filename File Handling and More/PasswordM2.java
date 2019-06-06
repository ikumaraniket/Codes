package assignments;

import java.io.BufferedReader;  
import java.io.BufferedWriter;  
import java.io.FileNotFoundException;  
import java.io.FileReader;  
import java.io.FileWriter;  
import java.io.IOException;  

public class PasswordM2  {
	
	public void CheckUserName() {
		
		
		
		
		
	}

	public static void main (String[] args) throws IOException {
		   
		  BufferedReader bufReader = null;  
		  BufferedWriter bufWriter = null;  
		  
		  try {  
		   bufReader = new BufferedReader(new FileReader("D:\\aniket\\read.txt"));  
		   bufWriter = new BufferedWriter(new FileWriter("D:\\aniket\\write.txt"));  
		   String data;  
		   while ((data = bufReader.readLine()) != null) {  
		    System.out.println(data);  
		    bufWriter.write(data);  
		   }  
		  } catch (FileNotFoundException e) {  
		   e.printStackTrace();  
		  } finally {  
		   if (bufReader != null)  
		    bufReader.close();  
		   if (bufWriter != null)  
		    bufWriter.close();   
		  }  
		 }  
}