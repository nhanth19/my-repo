package enumeration;

public enum Position {
	INSIDE("Trong đường tròn"),
	ONSIDE("Trên đường tròn"),
	OUTSIDE("Ngoài đường tròn");
	
	String value;
	
	private Position(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
