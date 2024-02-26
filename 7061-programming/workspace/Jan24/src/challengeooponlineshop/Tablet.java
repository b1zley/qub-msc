package challengeooponlineshop;

public class Tablet {

	
	// stored values
	private String manufacturer;
	private String model;
	private double price;
	private boolean android;
	private double size;
	private String notes;
	
	// getters and setters
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isAndroid() {
		return android;
	}
	public void setAndroid(boolean android) {
		this.android = android;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		if(size > 5 && size < 21) {
			this.size = size;
		} else {
			System.out.println("size not set! value must be between 5 and 21");
		}
		
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		
		
		if(notes.length() > 250) {
			System.out.println("Maximum note length 250 - note truncated");
			this.notes = notes.substring(0,250);
		} else {
			this.notes = notes;
		}
	}
	
	// class methods
	
	public void allDetails() {
		System.out.println("Tablet details __________________");
		System.out.println("Manufacturer : " + this.manufacturer);
		System.out.println("Model : " + this.model);
		System.out.println("Price : "+ this.price);
		System.out.println("Android : " + this.isAndroid());
		System.out.println("Size : " + this.size);
		System.out.println("Notes : " + this.notes);
	}
	public Tablet(String manufacturer, String model, double price, boolean android, double size, String notes) {
		setManufacturer(manufacturer);
		setModel(model);
		setPrice(price);
		setAndroid(android);
		setSize(size);
		setNotes(notes);
	}
	
	
	
	
	
	
}
