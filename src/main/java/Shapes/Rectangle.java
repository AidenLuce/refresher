package Shapes;

public class Rectangle {
    protected double length;
    protected double width;


    public Rectangle (double length, double width){
        this.length = length;
        this.width = width;
    }

    public Rectangle() {

    }

    public double getArea(){
        return (length * width);
    }
    public double getPerimeter(){
        return ((length + width) *2);
    }

    public static void main(String[] args) {

    }
}
