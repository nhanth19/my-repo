package utils;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import common.FileExtension;

public class FileUtils {
	private static final Random rd = new Random();

	private FileUtils() {
	}
	
	//write json 
	public static void writeJson(File file, Object object) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(file, object);
			System.out.println("Write file " + file.getName() + " succesful.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//read json 
		public static <T> T readJson(File file, Class<T> classType) {
			T result = null;
			ObjectMapper mapper = new ObjectMapper();
			try {
				result = mapper.readValue(file, classType);
				System.out.println("Write file " + file.getName() + " succesful.");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return result;
		}
	
	public static Properties getProperties(File file) {
		Properties props = new Properties();
		try {
			props.load(new FileInputStream(file));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
	}

	// write objects
	public static void writeObject(File file, Object object) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null; 
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(object);
			System.out.println("Write file " + file.getName() + " successful.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileUtils.close(oos, fos);
		}
	}
	
	//read objects
	public static Object readObject(File file) {
		Object results = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null; 
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			results = ois.readObject();
			System.out.println("Read file " + file.getName() + " successful.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileUtils.close(ois, fis);
		}
		return results;
	}
	
	@SuppressWarnings({ "unchecked", "unused" })
	public static <T> List<T> safeList(Object object) {
		return (List<T>)object;
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
	
	public static <E> void printf(List<E> lists) {
		for(E e : lists) {
			System.out.println(e);
		}
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
