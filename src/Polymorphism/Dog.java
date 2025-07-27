package Polymorphism;

public class Dog extends Animal{

    @Override
    public void makeSound(){
        System.out.println("Dog Sounds Woof");
    }

    public  void fetch(){
        System.out.println("fetch is fun");
    }
    
}
