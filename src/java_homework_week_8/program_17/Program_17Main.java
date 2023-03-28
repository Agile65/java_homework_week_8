package java_homework_week_8.program_17;

//17. Carpet Cost Calculator
//Main class
public class Program_17Main {
    //main method
    public static void main(String[] args) {
        Program_17Carpet carpet=new Program_17Carpet(3.5);
        Program_17Floor floor=new Program_17Floor(2.75,4.0);
        Program_17Calculator calculator=new Program_17Calculator(floor,carpet);
        System.out.println("total= "+calculator.getTotalCost());
        carpet=new Program_17Carpet(1.5);
        floor=new Program_17Floor(5.4,4.5);
        calculator=new Program_17Calculator(floor,carpet);
        System.out.println("total= "+calculator.getTotalCost());
    }
}
