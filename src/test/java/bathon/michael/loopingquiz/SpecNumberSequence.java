package bathon.michael.loopingquiz;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Created by michaelbathon on 2/9/16.
 */
public class SpecNumberSequence {

    NumberSequence nummy;

    @Before
    public void setUp(){
        nummy = new NumberSequence();

    }

    @Test
    public void testGenerateNumberSequence(){

        String expected = " 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20";

        String actual = nummy.generateNumSequence(1, 20);

        assertEquals("Fails if it doesn't generate the number sequence with the same start and end range", expected, actual);



    }





}
