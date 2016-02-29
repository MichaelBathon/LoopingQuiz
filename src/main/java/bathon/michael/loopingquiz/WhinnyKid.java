package bathon.michael.loopingquiz;

import java.util.Scanner;

/**
 * Created by michaelbathon on 2/9/16.
 */
public class WhinnyKid {

    Scanner scan = new Scanner(System.in);

    public void areWeThereYet(){
        System.out.println("Are we there yet?");
        String userInput = scan.nextLine();
        response(userInput);
    }

    public void response(String userInput){
        userInput.toLowerCase();

        if(userInput.equals("yes")){
            System.out.println("good");
        } else{
            areWeThereYet();
        }
    }


    public static void main(String[] args) {

        WhinnyKid whiner = new WhinnyKid();

        whiner.areWeThereYet();

    }


}
