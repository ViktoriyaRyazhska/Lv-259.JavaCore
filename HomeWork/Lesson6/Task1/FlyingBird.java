/**
 * Created by Bogdan on 22.08.2017.
 */
public abstract class FlyingBird extends Bird {
    public String getFly() {
        return fly;
    }

    public void setFly(String fly) {
        this.fly = fly;
    }

    private String fly="Their fly";
    @Override
    public abstract void fly() ;
}
