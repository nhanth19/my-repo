package dml;

import static utils.FileUtils.*;

import java.io.File;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import bean.Grade;
import bean.Student;

public class Ex04 {
	private static final String path = "data" + File.separator + "student.json";             
	
	public static void main(String[] args) {
		File file = new File(path);
		List<Student> students = getAll();
		writeJson(file, students);
		Student student = readJson(new File(path), Student.class);
		System.out.println(student );
	}

	private static List<Student> getAll() {
		
		return Collections.singletonList(new Student(
				"123",
				"LeVanDowski",
				Arrays.asList("Java", "C","JavaScript"), 
				Arrays.asList(new Grade("A1", "Grade A1"), new Grade("B1", "Grade B1")),
				new HashMap<String, BigDecimal>() {
			private static final long serialVersionUID = -4216447551549951565L;
			{
				put("Java", BigDecimal.valueOf(10));
				put("C", BigDecimal.valueOf(8));
				put("JavaScript", BigDecimal.valueOf(109));
			}
		}));
	}
}
