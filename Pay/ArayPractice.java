import java.util.Arrays;
public class ArayPractice
{
    public static void boundsException()
    {
        int[] values = {1,4,9,16,25};
        
        int x = values[5];
    }
    
    public static void fillArray()
    {
        int[] values = new int[100];
        
        for(int i = 0;
        i < values.length;
        i++)
        {
            values[i] = i*i;
        }
        System.out.println( values );
        System.out.println( Arrays.toString( values ));
    }
}