package java_homework_week_8.program_26_encapsulations;
// 26. TestEncapsulation class
public class TestEncapsulation {
    //main method
    public static void main(String[] args) {
        Encapsulation obj=new Encapsulation();
        //setting values of the variables
        obj.setName("Amit");
        obj.setAge(19);
        obj.setRollNo(51);
        //Displaying values of the variables
        System.out.println("Prime's name: "+obj.getName());
        System.out.println("Prime's age: "+obj.getAge());
        System.out.println("Prime's rollNo: "+obj.getRollNo());
        //Direct access of rollNo is not possible due to encapsulation
        //System.out.println("Prime's rollNo : "+obj.geekName);
    }
}
