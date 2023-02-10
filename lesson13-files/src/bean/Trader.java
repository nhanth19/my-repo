package bean;

import java.io.Serializable;

public class Trader implements Serializable {
	// Serialization : convert file, or object into a byte stream
	// transient : pojo(plain old java object) : don't want write into file
	//    
	private static final long serialVersionUID = -4216447551549951565L;
	private transient final String name;
	private final String city;

	public Trader(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String toLine() {
		return city + ", " + name;
	}

	@Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	}

}
