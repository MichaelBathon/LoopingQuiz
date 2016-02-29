package bathon.michael.loopingquiz;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Created by michaelbathon on 2/9/16.
 */
public class SpecOddNumberSequence {

    OddNumberSequence oddBall;

    @Before
    public void setUp(){
        oddBall = new OddNumberSequence();
    }

    @Test
    public void testGenerateOddNumberSequence(){
        String expected = " 1 3 5 7 9 11 13 15 17 19 21";

        String actual = oddBall.generateOddNumSequence(-20, 21);

        assertEquals("Fails if it doesn't produce a sequence of only positive odd numbers", expected, actual);
    }
}
