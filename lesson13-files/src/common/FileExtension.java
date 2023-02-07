package common;

public enum FileExtension {
	//enum : special class
	npm4(".mp4"), mp3(".mp3"), txt(".txt"), java(".java"), png(".png");

	private String ext;

	FileExtension(String ext) {
		this.ext = ext;
	}

	public String getValue() {
		return this.ext;
	}
}
