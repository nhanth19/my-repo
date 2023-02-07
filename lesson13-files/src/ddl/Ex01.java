package ddl;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

import common.FileExtension;
import utils.FileUtils;

public class Ex01 {
	private static final String path = "NEW_FOLDER/java123.txt";
	private static final String dirPath = "data/random";
	
	public static void main(String[] args) throws IOException {
//		File file = FileUtils.create(path);
//		System.out.println("file : " + file);
		
//		FileUtils.create(dirPath, 20, FileExtension.values());
		
		//filter
		File dirFile = new File(dirPath);
		File[] files = dirFile.listFiles(new FileFilter() {
			@Override
			public boolean accept(File file) {
				return file.isFile() && file.getName().endsWith(FileExtension.txt.getValue());
			} 
			
		});
		FileUtils.printf(files);
	}
}

