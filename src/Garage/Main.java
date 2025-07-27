package Garage;

public class Main {
    public static void main(String[] args) {
        Coupe coupe = new Coupe();
        coupe.setColor("red");

        System.out.println(String.format("My Car is %s and have %d doors",coupe.getColor(),coupe.getDoors()));
    }
    
}
