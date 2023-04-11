package basics;

public class Cars extends Vehicle {

	private int numbeOfDoors;
	private int numbeOfTires;
	private String bodyType;
	private boolean backupCamera;

	// this - current class 
	// super - parent class
	
	
	public Cars() {
		super();
		this.numbeOfDoors = 0;
		this.numbeOfTires = 0;
		this.bodyType = "";
		this.backupCamera = false;
	}

	public Cars(String make) {
		this();
		super.setMake(make);
	}

	public Cars(int maxSpeed, String make, String model, int year, int numbeOfDoors, int numbeOfTires, String bodyType,
			boolean backupCamera) {
		super(maxSpeed, make, model, year);
		this.numbeOfDoors = numbeOfDoors;
		this.numbeOfTires = numbeOfTires;
		this.bodyType = bodyType;
		this.backupCamera = backupCamera;
	}

	public int getNumbeOfDoors() {
		return numbeOfDoors;
	}

	public void setNumbeOfDoors(int numbeOfDoors) {
		this.numbeOfDoors = numbeOfDoors;
	}

	public int getNumbeOfTires() {
		return numbeOfTires;
	}

	public void setNumbeOfTires(int numbeOfTires) {
		this.numbeOfTires = numbeOfTires;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	
	public boolean isBackupCamera() {
		return backupCamera;
	}

	public void setBackupCamera(boolean backupCamera) {
		this.backupCamera = backupCamera;
	}

	@Override
	public String toString() {
		return "Car ["+super.toString()
		+"\nnumbeOfDoors=" + numbeOfDoors 
		+ ", numbeOfTires=" + numbeOfTires 
		+ ", bodyType=" + bodyType
				+ ", backupCamera=" + backupCamera + "]";
	}

	public void brake() {
		// TODO Auto-generated method stub
		
	}

	
	
}

		
		
		
		

