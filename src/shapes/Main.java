package shapes;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length and width");
        // double length=scanner.nextDouble();
        // double width=scanner.nextDouble();

        Rectangle rectangle = new Rectangle(5,10);
        Square squre = new Square(5,10);
        // Rectangle bathroom = new Rectangle(length,width);

        // double area = totalArea(kitchen,bathroom);
        double area = squre.getPerimeter();
        System.out.println("Area is "+area);

        
        scanner.close();
    }

    // public static double totalArea(Rectangle kitchen, Rectangle bathroom){
    //         return kitchen.getArea()+bathroom.getArea();
    //     }
}


