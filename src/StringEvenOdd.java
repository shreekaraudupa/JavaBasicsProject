import java.util.Scanner;

/**
 * Created by Sarvajna on 08-07-2017.
 */
public class StringEvenOdd {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
    StringEvenOdd(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter test case");
        int test=sc.nextInt();
        for(int i=0;i<test;i++)
        {
            System.out.println("Enter string");
            String input=sc.next();
            int leng=input.length();
            char[] inputChar=new char[leng];
            inputChar=input.toCharArray();

            StringBuffer sbEven=new StringBuffer();
            for(int j=0;j<leng;j+=2)
            {
                sbEven.append(inputChar[j]);
            }

            StringBuffer sbOdd=new StringBuffer();
            for(int j=1;j<leng;j+=2)
            {
                sbOdd.append(inputChar[j]);
            }
            System.out.println(sbEven+" "+sbOdd);

        }
    }

}
