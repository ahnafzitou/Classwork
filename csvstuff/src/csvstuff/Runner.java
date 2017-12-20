package csvstuff;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.File;

public class Runner {
	public static void main(String[] argsssss) throws IOException
	{	
		File CVS = new File("data.csv");
		CSVUtilities potato =  new CSVUtilities(CVS); 
		
		ArrayList<String> yes = new ArrayList<String>();
		yes = (ArrayList<String>) potato.getColumnData(5);
		potato.getColumnData(5);
	}
}