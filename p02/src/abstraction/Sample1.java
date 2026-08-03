package abstraction;

abstract class Animal{
    abstract void eat();
    abstract void run();
}
class Cat extends Animal{

    @Override
    void eat() {
        System.out.println("cat class--eat()");
    }

    @Override
    void run() {
        System.out.println("cat class --run()");
    }
}
public class Sample1 {
    public static void main(String[] args) {
        Cat meow=new Cat();
        meow.eat();
        meow.run();
    }
}
