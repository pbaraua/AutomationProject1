package conFigFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ConFig {
	
	public static String getConfig(String value) throws IOException {
	File file = new File("./Config.Properties");
	FileInputStream fis = new FileInputStream(file);
	Properties ps = new Properties();
	ps.load(fis);
	
	return ps.getProperty(value);
	
	}
}
