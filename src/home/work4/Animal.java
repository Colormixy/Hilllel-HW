package home.work4;

public abstract class Animal {
    private int run;
    private int swim;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void run(int runDistance) {
        System.out.println(name + " have ran " + run + " meters");
    }

    public void swim(int swimDistance) {
        System.out.println(name + " have swam " + swim + " meters");
    }
}