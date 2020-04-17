package Distance;

import java.util.Scanner;

public class TimeConverter {
    public void TimeConverted()
    {
        System.out.println("Enter your choice");
        System.out.println("hours to minutes");
        System.out.println("hours to seconds");
        Scanner sc = new Scanner(System.in);
        int choice=sc.nextInt();
        System.out.println("Enter the value to convert");
        int val=sc.nextInt();
        double converted=0.0;
        if(choice==1)
        {
            converted=val*60;
        }
        else if(choice==2)
        {
            converted=val*60*60;
        }
        System.out.println("Value after conversion");
        System.out.println(converted);

    }
}
