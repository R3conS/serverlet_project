package models;

public class Article {

	private long number;
	private String label;
	private String imagePath;
	private float price;

	public Article(long number, String label, String imagePath, float price) {
		super();
		this.number = number;
		this.label = label;
		this.imagePath = imagePath;
		this.price = price;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
