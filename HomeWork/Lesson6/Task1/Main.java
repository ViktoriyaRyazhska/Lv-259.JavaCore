/**
 * Created by Bogdan on 22.08.2017.
 */
public class Main  {
    public static void main(String[] args) {
        Bird[]birds=new Bird[4];
        birds[0]=new Eagle();
        birds[0].setLayEggs(true);
        birds[0].setFeathers("long");
        birds[1]=new Swallow();
        birds[1].setLayEggs(true);
        birds[1].setFeathers("short");
        birds[2]=new Penguin();
        birds[2].setLayEggs(true);
        birds[2].setFeathers("hard");
        birds[3]=new Chicken();
        birds[3].setLayEggs(true);
        birds[3].setFeathers("short");
        for (int i=0;i<birds.length;i++){
            System.out.println("Bird - "+(i+1));
            System.out.println(birds[i].getClass());
            System.out.println("Lay Eggs - "+birds[i].isLayEggs());
            System.out.println("Feathers - "+birds[i].getFeathers());
            birds[i].fly();
            System.out.println();
        }

    }
}
