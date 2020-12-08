package example;

public class Student {
	private String name;
	private int escore;
	private int mscore;
	
	public Student(String name, int escore, int mscore) {
		super();
		this.name = name;
		this.escore = escore;
		this.mscore = mscore;
	}

	public String getName() {
		return name;
	}

	public int getEscore() {
		return escore;
	}

	public int getMscore() {
		return mscore;
	}
	
	public void showStuInfo() {
		System.out.println("이름: " + name + " 수학점수: " + mscore + " 영어점수: " + escore);
	}
	
	

}
