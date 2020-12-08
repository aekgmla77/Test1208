package example;

import java.util.Arrays;
import java.util.List;

public class Exam04 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("Hong", 80, 90),
				new Student("King", 30, 60),
				new Student("Choi", 90, 80),
				new Student("Hwang", 80, 15)
				);
		list.stream()
				.filter(s -> s.getEscore() + s.getMscore() < 100)
				.forEach(s -> s.showStuInfo());
	}

}
