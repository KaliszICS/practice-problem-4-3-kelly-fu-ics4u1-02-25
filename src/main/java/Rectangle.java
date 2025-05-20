public class Rectangle {
    private double width;
    private double length;

    public Rectangle(){
        this.length = 4;
        this.width = 8;
    }

    public Rectangle (double length){
        this.length = length;
        this.width = 8;
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

}