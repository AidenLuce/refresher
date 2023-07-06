package Shapes;

public class Square extends Rectangle{
    public double side;
    public double getArea(double side){
        return side * side;
    }
    public Square(double side){
        this.length = side;
        this.width = side;
    }
}
