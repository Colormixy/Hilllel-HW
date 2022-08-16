package home.work4;

public class Dog extends Animal {
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void run(int runDistance) {

        if (runDistance >= 0 && runDistance <= 500) {
            System.out.println(getName() + " have ran " + runDistance + " meters");
        } else {
            System.out.println(getName() + " can't run this amount of meters");
        }
    }

    public void swim(int swimDistance) {
        if (swimDistance >= 0 && swimDistance <= 10) {
            System.out.println(getName() + " have swam " + swimDistance + " meters");
        } else {
            System.out.println(getName() + " can't swim this amount of meters");
        }
    }
}