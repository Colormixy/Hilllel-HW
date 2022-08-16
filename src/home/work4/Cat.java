package home.work4;

public class Cat extends Animal {

    public void run(int runDistance) {
        if (runDistance >= 0 && runDistance <= 200) {
            System.out.println("The cat have ran " + runDistance + " meters");
        } else {
            System.out.println("The cat can't run this amount of meters");
        }
    }

    public void swim() {
        System.out.println("The cat can't swim");
    }
}