package basics;

public class MotorCycle extends Vehicle{
	
	//
	private String transmission;
	private String bikeType;
	private int cylinders;

	public MotorCycle() {
		super();
		this.transmission = "";
		this.bikeType = "";
		this.cylinders = 0;
	}

	public MotorCycle(String transmission, String bikeType, int cylinders) {
		super();
		this.transmission = transmission;
		this.bikeType = bikeType;
		this.cylinders = cylinders;
	}

	public MotorCycle(int maxSpeed, String make, String model, int year, String transmission, String bikeType,
			int cylinders) {
		super(maxSpeed, make, model, year);
		this.transmission = transmission;
		this.bikeType = bikeType;
		this.cylinders = cylinders;
	}
	
	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getBikeType() {
		return bikeType;
	}

	public void setBikeType(String bikeType) {
		this.bikeType = bikeType;
	}

	public int getCylinders() {
		return cylinders;
	}

	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}

	@Override
	public String toString() {
		return "MotorCycle [" + super.toString() + "\ntransmission=" + transmission + ", bikeType=" + bikeType
				+ ", cylinders=" + cylinders + "]";
	}
	
	
}
	
	