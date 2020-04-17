package Distance;

import java.util.Scanner;

public class Distance {

    public void Distance()
    {
        System.out.println("Enter your choice");
        System.out.println("Meter to KM");
        System.out.println("Miles to KM");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        int choice=sc.nextInt();
        System.out.println("ENter your value");
        int val=sc.nextInt();
        double converted=0.0;
        if(choice==1)
        {
            converted=val/1000;
        }
        else if(choice==2)
        {
            converted=val*1.6;
        }
        System.out.println("Value after conversion");
        System.out.println(converted);

    }
}
