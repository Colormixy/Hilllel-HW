package home.work4;


public class Dog extends Animal {

    public void run(int runDistance) {
        if (runDistance >= 0 && runDistance <= 500) {
            System.out.println("The dog have ran " + runDistance + " meters");
        } else {
            System.out.println("The dog can't run this amount of meters");
        }
    }

    public void swim(int swimDistance) {
        if (swimDistance >= 0 && swimDistance <= 10) {
            System.out.println("The dog have swam " + swimDistance + " meters");
        } else {
            System.out.println("The dog can't swim this amount of meters");
        }
    }
}