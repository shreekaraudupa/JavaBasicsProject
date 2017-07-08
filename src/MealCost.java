import java.util.Scanner;

/**
 * Created by Sarvajna on 08-07-2017.
 */
public class MealCost {
    public static void main(String[] args) {

        // Print your result
    }
    MealCost(){
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage


        float tipMul=(float)tipPercent/100;
        float tip=(float) (mealCost*tipMul);

        float taxMul=(float)taxPercent/100;
        float tax=(float) (mealCost*taxMul);

        float totalCost=(float) (mealCost+tip+tax);

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCostRound = (int) Math.round(totalCost);
        System.out.println("Final  bill is "+totalCostRound);
    }

}
