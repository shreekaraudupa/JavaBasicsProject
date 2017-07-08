import java.util.Scanner;

/**
 * Created by Sarvajna on 08-07-2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice = 0;
        String exit="y";
        while(choice!=50&&exit.equals("y"))
        {
            System.out.println("1.Taking string input ");
            System.out.println("2.Billing System (operators)");
            System.out.println("3.String even odd places");
            System.out.println("4.Dictionary usig HashMap");
            System.out.println("5.Binary of a number ");
            System.out.println("50.Exit");

            choice=sc.nextInt();

            switch(choice)
            {
                case 1:
                    StringInput one=new StringInput();
                    break;
                case 2:
                    MealCost two=new MealCost();
                    break;
                case 3:
                    StringEvenOdd three=new StringEvenOdd();
                    break;
                case 4:
                    MyDictionary four=new MyDictionary();
                    break;
                case 5:Binary five=new Binary();
                    break;

            }
            System.out.println("Continue y/n ?");
            exit=sc.next();
        }
    }

}
