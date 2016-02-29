package bathon.michael.loopingquiz;

/**
 * Created by michaelbathon on 2/9/16.
 */
public class OddNumberSequence {

    public String generateOddNumSequence(int startRange, int endRange){
        String sequence = "";

        for(int i = startRange; i <= endRange; i++){

            if(0 < i && i <101 && i%2 == 1)
            sequence += " " + i;
        }
        return sequence;
    }

}
