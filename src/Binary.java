import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Sarvajna on 08-07-2017.
 */
public class Binary {
    public static void main(String[] args) {

    }
    Binary(){
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> hm=new HashMap<>();
        System.out.println("Enter number");
        int n=sc.nextInt();
        int decimal=n;
        int key=1;
        int remainder;
        do{

            remainder=decimal%2;
            decimal=decimal/2;
            hm.put(key,remainder);
            key++;

        }while(decimal!=1);
        remainder=decimal%2;
        hm.put(key,remainder);

        System.out.println("Size="+hm.size());
        System.out.println(hm);
        int size=hm.size();
        System.out.print("Binary is -");

        for(int i=size;i>0;i--)
        {
            System.out.print(hm.get(i));
        }
        System.out.println();

        int countCons=1;
        int k;
        for(int i=1;i<size;i++)
        {
            if(hm.get(i)==1)
            {
                k=i+1;
                if(hm.get(k)==1)
                {
                    countCons++;
                }
            }
        }
        System.out.println("Consecutive one's -"+countCons);


    }
}
