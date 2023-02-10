package dml;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import bean.Trader;
import static utils.FileUtils.*;

public class Ex02 {
	private static final String path = "data" + File.separator + "trader.txt";

	public static void main(String[] args) {
		File file = new File(path);
		List<Trader> traders = getTraders();
		
		writeObject(file, traders);
		List<Trader> results = safeList(readObject(file));
		printf(results);
	}
	
	private static List<Trader> getTraders() {
		return Arrays.asList(
				new Trader("Football Match", "AC Milan - Inter Milan"),
				new Trader("Football Match", "Nothingham - Liverpool"),
				new Trader("Football Match", "Smoke City - Mu "),
				new Trader("Football Match", "Nothingham - Liverpool")
		);
	}
}


