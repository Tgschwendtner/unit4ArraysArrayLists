import java.util.ArrayList;
public class ArrayLists
{
    public static void main( String[] args)
    {
        ArrayList<String> words = new ArrayList<String>();
        
        words.add( "tests");
        words.add( "like");
        words.add("like");
        words.add("cookie");
        System.out.println(words);
        
        for( int i = words.size() -1; i >= 0 ; i--)
        {
            String word = words.get(i);
            if(word.equals("like"))
            {
                words.remove( i );
            }
        }
        System.out.println(words);
    }
}