package java_homework_week_8.program_17;
//17. Carpet Cost Calculator
//Carpet class
public class Program_17Carpet {
    double cost;
    Program_17Carpet(double cost){
        if(cost<0){
            cost=0;
        }
        this.cost=cost;
    }
    public double getCost(){
        return cost;
    }

}
