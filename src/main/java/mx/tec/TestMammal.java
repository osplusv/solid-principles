package mx.tec;

public class TestMammal {
    public static void main(String[] args) {
        System.out.println("Hello World\n");

        Mammal cat = new Cat();
        Mammal dog = new Dog();

        System.out.println("Cat says " + cat.makeNoise());
        System.out.println("Dog says " + dog.makeNoise());
    }
}
