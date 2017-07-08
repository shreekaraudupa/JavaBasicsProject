import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Sarvajna on 08-07-2017.
 */
public class MyDictionary {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
    MyDictionary(){

        Scanner sc=new Scanner(System.in);
        Map<String,String> phone=new HashMap<String,String>();

        int n=sc.nextInt();
        String name,phNo;

        for(int i=0;i<n;i++)
        {
            name=sc.next();
            phNo=sc.next();

            phone.put(name, phNo);
        }

        //System.out.println(phone.toString());

        while(sc.hasNextLine())
        {
            String result=sc.next();


            String val=phone.get(result);

            if(val==null)
                System.out.println("Not found");
            else
                System.out.println(result+"="+val);
        }
    }

}
