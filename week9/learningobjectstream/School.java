package week9.learningobjectstream;

import java.io.Serializable;

public class School implements Serializable {

	private static final long serialVersionUID = 7395709046779651366L;
	private String shortform;
	private String name;
	
	public School(String shortform, String name) {
		super();
		this.shortform = shortform;
		this.name = name;
	}

	public String getShortform() {
		return shortform;
	}

	public void setShortform(String shortform) {
		this.shortform = shortform;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "School [shortform=" + shortform + ", name=" + name + "]";
	}
	
	
	
}
