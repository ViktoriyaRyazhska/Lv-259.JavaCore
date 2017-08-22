package regina.com;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Bird[] b = new Bird[5];
        b[0] = new Eagle("Eagle1", false);
        b[1] = new Swallow("Swallow1",false);
        b[2] = new Penguin("Penguin1",false);
        b[3] = new Chicken("Chicken1", true);
        b[4] = new Eagle("Eagle2", false);

    printArr(b);

    }


    public static void printArr(Bird[] b) {
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+ ", ");
            b[i].fly();
             }
         }
    }


