package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal rocky = new Dog();
        // rocky.makeSound();
        // Dog rokDog = (Dog)rocky;
        // rokDog.fetch();
        feed(rocky);

        Animal sasha = new Dog();
        // sasha.makeSound();

        sasha = new Cat();
        sasha.makeSound();
        feed(sasha);
    }
        public static void feed(Animal animal) {
            if(animal instanceof Dog){
                System.out.println("Hers's is your Dog food");
            }
        }


    
}
