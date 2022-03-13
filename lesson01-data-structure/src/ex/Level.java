package ex;

public enum Level {
	BAD("Yếu"),
	MEDIUM("Trung bình"),
	PRETTY_GOOD("Khá"),
	GOOD("Giỏi");
	
	public String value;
	
	private Level(String value) {
		this.value = value;
	}
}
