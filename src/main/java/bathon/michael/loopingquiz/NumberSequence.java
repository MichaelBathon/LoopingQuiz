package bathon.michael.loopingquiz;

/**
 * Created by michaelbathon on 2/9/16.
 */
public class NumberSequence {

    public String generateNumSequence(int startRange, int endRange){
        String sequence = "";

        for(int i = startRange; i <= endRange; i++){
            sequence += " " + i;
        }
        return sequence;
    }

}
