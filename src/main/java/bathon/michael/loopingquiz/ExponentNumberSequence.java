package bathon.michael.loopingquiz;

/**
 * Created by michaelbathon on 2/9/16.
 */
public class ExponentNumberSequence {


    public String generateExponentialNumSequence(int startRange, int endRange){
        String sequence = "";

        for(int i = startRange; i <= endRange; i++){
            for(int j = 1; j <=10; j++)
            sequence += " " + ((int)Math.pow(i, j));


        }



        return sequence;
    }





}
