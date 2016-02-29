package bathon.michael.loopingquiz;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;


/**
 * Created by michaelbathon on 2/9/16.
 */
public class SpecExponentNumberSequence {

    ExponentNumberSequence expo;

    @Before
    public void setUp(){

        expo = new ExponentNumberSequence();
    }

    @Test
    public void testExpoNumSequenceGenerator(){
        String expected = " 1 1 1 1 1 1 1 1 1 1 2 4 8 16 32 64 128 256 512 1024 3 9 27 81 243 729 2187 6561 19683 59049";

        String actual = expo.generateExponentialNumSequence(1, 3);

        assertEquals("Fails if the sequence isn't filled with the numbers carried to the 10th power", expected, actual);

    }



}
