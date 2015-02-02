import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;


public class Interpret {

	
	
	public static void main(String[]args) throws IOException{
		File f = new File("C:/Users/Cody/Documents/Output.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String command = br.readLine();
		int lines = 0;
				
		if(!command.equals("")){
			
			if(command.equals("<<START>>")){
				System.out.println(lines + ". We are at the starting position.");
			} else if(command.contains("[MOVE]")){
				//code for decoding x and y values
			}
			
		} else {
			
			//done, celebrate!
			
		}
		
		
		
		fr.close();
		br.close();
	}
	
}
