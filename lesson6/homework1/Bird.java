package regina.com;

public abstract class Bird {

    String feathers;
    boolean layEggs;

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;

    }

    public abstract void fly();

    @Override
    public String toString() {
        return "Type of bird: " + feathers + ", lay eggs:" + layEggs;
    }
}
