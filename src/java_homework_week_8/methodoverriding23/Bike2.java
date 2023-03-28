package java_homework_week_8.methodoverriding23;
//23.
//Creating a child class
public class Bike2 extends Vehicle{
    //defining the same method as in the parent class
    public void run(){
        System.out.println("Bike is running safely");

    }
    //main method
    public static void main(String[] args) {
        Bike2 obj=new Bike2();//creating object
        obj.run();//calling method
    }
}
