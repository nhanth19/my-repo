package dml;

import java.io.File;
import java.util.Properties;

import static utils.FileUtils.*;

public class Ex03 {
	private static final String path = "data" + File.separator + "config.properties";

	public static void main(String[] args) {
		File file = new File (path);
		Properties props = getProperties(file);
		
		System.out.println("dbname : " + props.getProperty("dbname"));
		System.out.println("dbtype : " + props.getProperty("dbtype"));
		System.out.println("port : " + props.getProperty("port"));
		
	}
}
