package bathon.michael.loopingquiz;

/**
 * Created by michaelbathon on 2/9/16.
 */
public class RandomNumberSequence {


    public String generateRandomNumberSequence(int startRange, int endRange){
        String sequence = "";

        for(int i = startRange; i < endRange; i++){

            sequence += "" + ((int)(Math.random() * 10) +1);
        }


        return sequence;
    }






}
