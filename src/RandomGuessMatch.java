import java.util.Scanner;

public class RandomGuessMatch {

    public static void main(String[] args){

        int userGuess;
        int randomNum;
        boolean right = false;

        System.out.println("Guess a the random number between 1 and 5 >>>>");

        Scanner inputDevice = new Scanner(System.in);
        userGuess = inputDevice.nextInt();

        randomNum = 1 + (int)(Math.random() * 5);

        if (userGuess == randomNum){
            right = true;
        }

        System.out.println("Player Guess: " + userGuess);
        System.out.println("Random Number: " + randomNum);

      if (right  == true){
          System.out.println("correct!");
      } else{
          System.out.println("Wrong!");
      }
    }
}
