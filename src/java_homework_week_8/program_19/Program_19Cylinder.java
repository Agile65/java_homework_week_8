package java_homework_week_8.program_19;

//19. Cylinder class
public class Program_19Cylinder extends Program_19Circle {
    //instance variable
    double height;
    public Program_19Cylinder(double radius,double height) {
        super(radius);
        if(height<0){
            this.height=0;
        }else{
            this.height=height;
        }
    }
    public double getHeight(){
        return this.height;
    }
    public double getVolume(){
        return getArea()*getHeight();
    }
}
