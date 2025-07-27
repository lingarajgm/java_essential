package Polymorphism;

public class Cat extends Animal{

    @Override
    public  void makeSound(){
        System.out.println("Cat Sounds Meow");
    }

    public  void scratch(){
        System.out.println("I am Cat, I scratch the things");
    }
    
}
