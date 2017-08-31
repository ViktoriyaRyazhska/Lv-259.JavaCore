package homework_1;

public class FlyingBird extends Bird {
	private String feathers;
	private int leyEggs;

	public FlyingBird() {
		super();
	}

	public FlyingBird(String feathers, int leyEggs) {
		super();
		this.feathers = feathers;
		this.leyEggs = leyEggs;
	}

	@Override
	public String toString() {
		return "FlyingBird [feathers=" + feathers + ", leyEggs=" + leyEggs + "]";
	}

	public String getFeathers() {
		return feathers;
	}

	public void setFeathers(String feathers) {
		this.feathers = feathers;
	}

	public int getLeyEggs() {
		return leyEggs;
	}

	public void setLeyEggs(int leyEggs) {
		this.leyEggs = leyEggs;
	}

	@Override
	public void fly() {
		System.out.println("I CAN FLY");
	}

}
