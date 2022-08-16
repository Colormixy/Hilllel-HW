package home.work4;

public class Cat extends Animal {
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void run(int runDistance) {
        if (runDistance >= 0 && runDistance <= 200) {
            System.out.println(getName() + " have ran " + runDistance + " meters");
        } else {
            System.out.println(getName() + " can't run this amount of meters");
        }
    }

    @Override
    public void swim(int swimDistance) {
        System.out.println(getName() + " can't swim. The cat have swam " + swimDistance + " meters");
    }
}