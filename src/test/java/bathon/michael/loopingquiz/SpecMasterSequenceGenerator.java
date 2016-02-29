package bathon.michael.loopingquiz;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Created by michaelbathon on 2/9/16.
 */
public class SpecMasterSequenceGenerator {

    MasterSequenceGenerator master;

    @Before
    public void setUp(){
        master = new MasterSequenceGenerator();
    }

    @Test
    public void testMasterCreateRegSequence(){
        String expected = " 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20";

        String actual = master.createAnySequence(1, 20, "regular");

        assertEquals("Fails if master doesn't call the regular number sequence generator method", expected, actual);
    }

    @Test
    public void testMasterCreateOddSequence(){
        String expected = " 1 3 5 7 9 11 13 15 17 19";

        String actual = master.createAnySequence(1, 20, "odd");

        assertEquals("Fails if it doesn't produce a sequence of only positive odd numbers", expected, actual);
    }

    @Test
    public void testMasterCreateExpoSequence(){
        String expected = " 1 1 1 1 1 1 1 1 1 1 2 4 8 16 32 64 128 256 512 1024 3 9 27 81 243 729 2187 6561 19683 59049";

        String actual = master.createAnySequence(1, 3, "exponential");

        assertEquals("Fails if the sequence isn't filled with the numbers carried to the 10th power", expected, actual);

    }

    @Test
    public void testMasterCreateRandomSequence(){
        String expected = " ";
        String actual = master.createAnySequence(0, 1, "random");

        int testActual = Integer.parseInt(actual);

        assertTrue("Fails test if the number isn't between 1-10", (0 < testActual && testActual <= 10));


    }













}
