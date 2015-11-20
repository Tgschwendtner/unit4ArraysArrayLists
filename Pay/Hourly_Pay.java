import java.util.Scanner;
import java.util.Arrays;
public class Hourly_Pay
{
    public  static void Hourly_Pay()
    {
        Scanner scan = new Scanner(System.in);
        double Hourlypay;
        int days;
        int hours;
        int minutes;
        //Gets hourly Pay
        System.out.print ("What is your hourly Pay? ");
        Hourlypay = scan.nextDouble();
        //Gets Days worked
        System.out.print ("Days did you work");
        days = scan.nextInt();
        //Makes array Length = days worked
        double[] Hoursworked = new double[days];
        double[] MinutesWorked = new double[days];
        for (int i = 0; i < days; i++)
        {
            if (i == 0)
            {
                System.out.print ("How many hours did you work on the first day? ");
                hours = scan.nextDouble();
                System.out.print ("How many minutes did you work on the first day? ");
                minutes = scan.nextDouble();
            }
            else
            {
                System.out.print ("How many hours did you work on the next day? ");
                hours = scan.nextDouble();
                System.out.print ("How many minutes did you work on the next day? ");
                minutes = scan.nextDouble();
            }
            Hoursworked[i] = hours;
            MinutesWorked[i] = minutes;
        }
        //Adds up all the hours
        
        //Calculates total pay depending on users hourly pay input
        
        //print the ammount
        System.out.println( Arrays.toString( Hoursworked ));
        System.out.println( Arrays.toString( MinutesWorked ));
    }
}

