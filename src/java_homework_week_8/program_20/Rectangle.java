package java_homework_week_8.program_20;
//20. Rectangle class
public class Rectangle {
    double width;
    double length;

    public Rectangle(double width, double length) {
        if (length < 0 || width < 0) {
            this.length = 0;
            this.width = 0;
        }
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return (width * length);
    }

}
