package task5;

public class Car {

	private String type;
	private String nameOfCar;
	private int yearOfProduct;
	private double engineCapacity;
	
	public Car(String type, String nameOfCar, int yearOfProduct, double engineCapacity) {
		this.type = type;
		this.nameOfCar = nameOfCar;
		this.yearOfProduct = yearOfProduct;
		this.engineCapacity = engineCapacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNameOfCar() {
		return nameOfCar;
	}

	public void setNameOfCar(String nameOfCar) {
		this.nameOfCar = nameOfCar;
	}

	public int getYearOfProduct() {
		return yearOfProduct;
	}

	public void setYearOfProduct(int yearOfProduct) {
		this.yearOfProduct = yearOfProduct;
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(engineCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nameOfCar == null) ? 0 : nameOfCar.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + yearOfProduct;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (Double.doubleToLongBits(engineCapacity) != Double.doubleToLongBits(other.engineCapacity))
			return false;
		if (nameOfCar == null) {
			if (other.nameOfCar != null)
				return false;
		} else if (!nameOfCar.equals(other.nameOfCar))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (yearOfProduct != other.yearOfProduct)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", nameOfCar=" + nameOfCar + ", yearOfProduct=" + yearOfProduct
				+ ", engineCapacity=" + engineCapacity + "]";
	}
	
	
	
}	