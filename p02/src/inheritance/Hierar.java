package inheritance;

class Animal {
    int age;
    String name;
    void details() {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
class Dog extends Animal{
    String breed;
    void Dog_details() {
        System.out.println("Breed:"+breed);
    }
}
class Cat extends Animal{
    String colour;
    void Cat_details(){
        System.out.println("Colour:"+colour);
    }
}
class Bird extends Animal{
    int wingspan;
    void bird_details(){
        System.out.println("wingspan"+wingspan);
    }
}
public class Hierar {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.name="Candy";
        d.age=10;
        d.breed="Husky";
        d.details();
        d.Dog_details();

        Cat c=new Cat();
        c.name="Tuffy";
        c.age=12;
        c.colour="Black";
        c.details();
        c.Cat_details();
    }
}
