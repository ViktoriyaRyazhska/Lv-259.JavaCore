package homework_1;

public class NonflyingBird extends Bird {
	private String feathers;
	private int leyEggs;

	public NonflyingBird() {
		super();
	}

	public NonflyingBird(String feathers, int leyEggs) {
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
		System.out.println("I CANT FLY");
	}

}
