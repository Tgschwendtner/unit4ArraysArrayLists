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
        System.out.print ("Days did you work? ");
        days = scan.nextInt();
        //Makes array Length = days worked
        double[] Hoursworked = new double[days];
        double[] MinutesWorked = new double[days];
        System.out.print ("\n");
        for (int i = 0; i < days; i++)
        {
            if (i == 0)
            {
                System.out.print ("How many hours did you work on the first day? ");
                hours = scan.nextInt();
                System.out.print ("How many minutes did you work on the first day? ");
                minutes = scan.nextInt();
                System.out.print ("\n");
            }
            else
            {
                System.out.print ("How many hours did you work on the next day? ");
                hours = scan.nextInt();
                System.out.print ("How many minutes did you work on the next day? ");
                minutes = scan.nextInt();
                System.out.print ("\n");
            }
            Hoursworked[i] = hours;
            MinutesWorked[i] = minutes;
        }
        //Adds up all the hours
        double totalhours = 0;
        double totalminutes = 0;
        for (int i = 0; i <= days - 1; i++)
        {
            totalhours = totalhours + Hoursworked[i];
        }
        for (int m = 0; m <= days - 1; m++)
        {
            totalminutes = totalminutes + MinutesWorked[m];
        }
        //Calculates total pay depending on users hourly pay input
        totalminutes = totalminutes+ (totalhours*60);
        double totaltime = (totalminutes/60);
        double totalpay = (totaltime*Hourlypay);
        //print the ammount
        System.out.println("$"+ totalpay);
    }
}

