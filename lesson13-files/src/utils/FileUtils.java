package utils;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

import common.FileExtension;

public class FileUtils {
	private static final Random rd = new Random();

	private FileUtils() {
	}

	// create file
	public static File create(String path) {
		boolean isValid = false;
		File file = new File(path);
		if (!file.exists()) {
			File parent = file.getParentFile();
			if (!parent.exists()) {
				parent.mkdirs();
			}
			isValid = createNewFile(file);
		}
		return isValid ? file : null;
	}

	// write file
	public static void write(File file, String... texts) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			// append : true/false
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			// manipulate
			for (String text : texts) {
				bw.newLine();
				bw.write(text);
			}
			System.out.println("Write file " + file.getName() + " successful.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// save and close
			close(bw, fw);
			autoOpen(file);
		}
	}

	// read file
	public static void read(File file) {
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static boolean createNewFile(File file) {
		boolean isValid = false;

		try {
			isValid = file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return isValid;
	}

	public static boolean[] create(String dirPath, int nof, FileExtension[] exts) {
		boolean[] result = new boolean[nof];
		File dirFile = new File(dirPath);
		if (!dirFile.exists()) {
			dirFile.mkdirs();
		}

		for (int i = 0; i < nof; i++) {
			String name = "" + System.currentTimeMillis() + exts[rd.nextInt(exts.length)].getValue();
			File file = new File(dirFile, name);
			result[i] = createNewFile(file);
		}
		return result;
	}

	public static void printf(File... files) {
//		for(File file : files) {
//			System.out.println(file.getPath());
//		}

		Arrays.stream(files).forEach(f -> System.out.println(f.getAbsoluteFile()));

	}

	public static void autoOpen(File path) {
		try {
			Desktop.getDesktop().open(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void close(AutoCloseable... closeables) {
//		for(AutoCloseable closeable : closeables) {
//			if(closeable != null) {
//				try {
//					closeable.close();
//				} catch (Exception e) {
//					e.printStackTrace();
//				} 
//			}
//		}
		Arrays.stream(closeables).forEach(c -> {
			try {
				c.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
}
