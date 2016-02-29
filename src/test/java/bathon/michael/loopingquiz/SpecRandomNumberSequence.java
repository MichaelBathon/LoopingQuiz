package bathon.michael.loopingquiz;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by michaelbathon on 2/9/16.
 */
public class SpecRandomNumberSequence {

    RandomNumberSequence rando;

    @Before
    public void setUp(){
        rando = new RandomNumberSequence();
    }

    @Test
    public void testRandomNumberSequenceGenerator(){
        String expected = " ";
        String actual = rando.generateRandomNumberSequence(0, 1);

        int testActual = Integer.parseInt(actual);

        assertTrue("Fails test if the number isn't between 1-10", (0 < testActual && testActual <= 10));


    }





}
