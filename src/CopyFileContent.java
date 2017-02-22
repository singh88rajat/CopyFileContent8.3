import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileContent {

	public static void main(String[] args) {
		File sfile = new File("F:/ACADGILD-FILE-HANDLING/source.txt");
		File dfile = new File("F:/ACADGILD-FILE-HANDLING/destination.txt");
		
		try {
			FileWriter sfw = new FileWriter(sfile);
			sfw.write("This is soruce file content");			
			sfw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileReader fr= new FileReader(sfile);
			char data[] = new char[1024];			
		    fr.read(data);
			fr.close();
			FileWriter contentcopy = new FileWriter(dfile);
			
			contentcopy.write(new String(data));
			contentcopy.close();
			System.out.println("File Copied Successfully");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
