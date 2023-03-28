package java_homework_week_8.program_17;

//17. Carpet Cost Calculator
//calculator  class
public class Program_17Calculator {
    Program_17Floor floor;
    Program_17Carpet carpet;
    Program_17Calculator(Program_17Floor floor,Program_17Carpet carpet){
        this.floor=floor;
        this.carpet=carpet;
    }
    public double getTotalCost(){
        return floor.getArea()* carpet.getCost();
    }
}
