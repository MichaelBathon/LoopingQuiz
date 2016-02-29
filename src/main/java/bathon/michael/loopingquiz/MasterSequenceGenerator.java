package bathon.michael.loopingquiz;

/**
 * Created by michaelbathon on 2/9/16.
 */
public class MasterSequenceGenerator {


    public String createAnySequence(int startRange, int endRange, String userSequenceChoice){

        String sequence = "";

        if(userSequenceChoice.equals("regular"))
            sequence = new NumberSequence().generateNumSequence(startRange,endRange);

        if(userSequenceChoice.equals("odd"))
            sequence = new OddNumberSequence().generateOddNumSequence(startRange,endRange);

        if(userSequenceChoice.equals("exponential"))
            sequence = new ExponentNumberSequence().generateExponentialNumSequence(startRange, endRange);

        if(userSequenceChoice.equals("random"))
            sequence = new RandomNumberSequence().generateRandomNumberSequence(startRange, endRange);

        return sequence;
    }

}
