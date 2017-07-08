import java.util.Scanner;

/**
 * Created by Sarvajna on 08-07-2017.
 */
public class StringInput {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
    public StringInput(){
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a integer double and string ");
        int a=scan.nextInt();
        int  sumInt=i+a;

        double b=scan.nextDouble();
        double sumDouble=d+b;

        String snew1=scan.next();
        String newS=scan.nextLine();

        System.out.println(sumInt);
        System.out.println(sumDouble);
        System.out.println(s+snew1+newS);

    }

}
