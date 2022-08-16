package home.work4;

public class Create_Animal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Kruzik");
        dog.run(618);
        dog.swim(4);

        Cat cat = new Cat();
        cat.setName("Boris");
        cat.run(67);
        cat.swim(0);
    }
}