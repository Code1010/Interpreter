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
		String command = "default";
		int lines = 1;
		double x = 0;
		double y = 0;
		while(!command.equals("<<STOP>>")){
			
			command = br.readLine();
				
				if(command.equals("<<START>>")){
					System.out.println(lines + ". We are at the starting position.");
				} else if(command.contains("[MOVE]")){
					//code for decoding x and y values
				    x = Double.valueOf(command.substring(command.indexOf("X")+1, command.indexOf("Y")-1));
				    y = Double.valueOf(command.substring(command.indexOf("Y")+1));
					System.out.println(lines + ". Move " + x + " inches in x. Move " + y + " inches in Y.");
				} else if(command.contains("[GATHER]")){
					int totes;
					String s = command.substring(command.indexOf((" "))).trim();
					totes = Integer.valueOf(s);
					System.out.println(lines + ". Gather " + totes + " tote(s)");
				} else {
					System.out.println("STOP");
				}
			lines++;
			
		}
		
		System.out.println("Reached the end of the file.");
		
		
		fr.close();
		br.close();
	}
	
}
