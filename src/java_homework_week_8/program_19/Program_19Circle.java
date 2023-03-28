package java_homework_week_8.program_19;
//19. Circle class
public class Program_19Circle {
    //instance variable
    double radius;
    public Program_19Circle(double radius){
        if(radius<0){
            this.radius=0;
        }
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return (radius*radius*Math.PI);
    }
}
