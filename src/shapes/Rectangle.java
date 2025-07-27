package shapes;


public class Rectangle{
    private double length;
    private double width;


public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
}





public void setLength(double length){
    this.length=length;
}
public void setWidth(double width){
    this.width=width;
}
public double getLength(){
    return length;
}
public double getWidth(){
    return width;
}

public double getPerimeter() {
    // setLength(length);
    // setWidth(width);
    // return getLength()*getWidth();
     System.out.println("Rectangle class called");
    return 2*length + 2*width;
}
}
