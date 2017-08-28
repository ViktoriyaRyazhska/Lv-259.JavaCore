
public class Car {
//Create class Car with fields type, year of production and engine capacity.
	private String type;
	int productionYear;
	private double capacity;
	
	
	public Car() {
	}

	public Car(String type, int productionYear, double capacity) {
		this.type = type;
		this.productionYear = productionYear;
		this.capacity = capacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Car type=" + type + ", productionYear=" + productionYear + ", capacity=" + capacity;
	} 
	
	
	
	
	
	
}
