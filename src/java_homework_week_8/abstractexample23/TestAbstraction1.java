package java_homework_week_8.abstractexample23;
//21. Class TestAbstraction
//In real scenario, method is called by programmer or user
class TestAbstraction1 {
    //main method
    public static void main(String[] args) {
        Shape s=new Circle1();//In a real scenario, object is provided through method e.g., getShape() method
        //Shape s1=new Rectangle();
        //s1.draw();
        s.draw();
    }

}
