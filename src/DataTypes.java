import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args){

        int cats = 5;
        int catsEntered;
        int barrel;

        System.out.println("Number of monkeys = " + cats);

        barrel = cats;

        System.out.println("number of monkeys in the barrel = " + barrel);
        System.out.println("How many monkeys would you like to add?");
        Scanner inputDevice = new Scanner(System.in);
        catsEntered =  inputDevice.nextInt();

        barrel = cats + catsEntered;

        System.out.println("There are now " + barrel + " monkeys in the barrel.");

        barrel = barrel - (1 + (int)(Math.random()*100));

        System.out.println("due to Thanos there are only " + barrel + " left as the others died from the snap.");
    }

}
