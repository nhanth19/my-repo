package dml;

import java.io.File;

import bean.Trader;
import utils.FileUtils;

public class Ex01 {

	private static String path = "data/readme.txt";

	public static void main(String[] args) {
		File file = new File(path);

		// write String to file
//		String[] texts = {
//				"Football Match : AC Milan - Inter Milan \n",
//				"Football Match : Chelsea - Mancity \n",
//				"Football Match : Smoke City - Mu \n",
//				"Football Match : Totterhotpurs - Everton \n",
//				"Football Match : Nothingham - Liverpool "
//		};
//		FileUtils.write(file, texts);

		//Write object to file
		Trader t1 = new Trader("Adam", "Milan");
		FileUtils.write(file, t1.toLine());
		FileUtils.read(file);
	}
}
