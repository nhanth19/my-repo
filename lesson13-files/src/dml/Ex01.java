package dml;

import java.io.File;

import utils.FileUtils;

public class Ex01 {
	
	private static String path = "data/readme.txt";
	
	public static void main(String[] args) {
		File file = new File(path);
		
//		String[] texts = {
//				"Football Match : AC Milan - Inter Milan \n",
//				"Football Match : Chelsea - Mancity \n",
//				"Football Match : Stoke City - Mu \n",
//				"Football Match : Totterh - Everton \n",
//				"Football Match : Nothingham - Liverpool "
//		};
//		FileUtils.write(file, texts);
		FileUtils.read(file);	
		
	}
}
