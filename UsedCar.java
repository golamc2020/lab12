package lab12;

public class UsedCar extends Car{

	private double millage;

	public UsedCar() {
		super();
	}

	public UsedCar(String make, String model, int year, double price, double millage) {
		super(make, model, year, price);
		this.millage = millage;
	}

	public double getMillage() {
		return millage;
	}

	public void setMillage(double millage) {
		this.millage = millage;
	}

	@Override
	public String toString() {
		return super.toString() + "UsedCar [millage=" + millage + "]";
	}
	
	
	
	
}
