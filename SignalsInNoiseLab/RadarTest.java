
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    @Test
    public void testRadar1()
    {
        //Creates Radar
        Radar radar = new Radar(20,20);
        //Sets monster location
        radar.setMonsterLocation(5,10);
        //scans
        for (int i = 0; i<1000; i++)
        {
            radar.scan();
        }
        //creates variables to save location and the biggest accumulator number
        int biggest_accumulator = 0;
        int monsters_row = 0;
        int monster_column = 0;
        //finds the possion of the moster(biggest acumulator value and saves its location)
        for ( int i = 0; i < 20; i++)
        {
            for ( int j = 0; j < 20; j++)
            {
                if (radar.getAccumulatedDetection(i , j) > biggest_accumulator)
                {
                    biggest_accumulator = radar.getAccumulatedDetection(i , j);
                    monsters_row = i;
                    monster_column = j;
                }
            }
        }
        //tests to see if the location it got matches the location of the moster
        assertEquals(5,monsters_row);
        assertEquals(10,monster_column);
    }
    @Test
    public void testRadar2()
    {
        //Creates Radar
        Radar radar = new Radar(20,20);
        //Sets monster location
        radar.setMonsterLocation(10,15);
        //scans
        for (int i = 0; i<1000; i++)
        {
            radar.scan();
        }
        //creates variables to save location and the biggest accumulator number
        int biggest_accumulator = 0;
        int monsters_row = 0;
        int monster_column = 0;
        //finds the possion of the moster(biggest acumulator value and saves its location)
        for ( int i = 0; i < 20; i++)
        {
            for ( int j = 0; j < 20; j++)
            {
                if (radar.getAccumulatedDetection(i , j) > biggest_accumulator)
                {
                    biggest_accumulator = radar.getAccumulatedDetection(i , j);
                    monsters_row = i;
                    monster_column = j;
                }
            }
        }
        //tests to see if the location it got matches the location of the moster
        assertEquals(10,monsters_row);
        assertEquals(15,monster_column);
    }
}
