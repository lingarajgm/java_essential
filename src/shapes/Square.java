package shapes;

public class Square extends Rectangle {
    

    public Square(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
                System.out.println("Square class called");
        return getLength();

    }

    
}
