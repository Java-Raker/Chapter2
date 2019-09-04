import javax.swing.*;

public class Eggs {

    public static void main(String[] args){

        final double COST_OF_A_DOZEN = 3.25;
        final double COST_OF_A_EGG = .45;
        int dozens;
        int looseEggs;
        int boughtEggs;
        double totalCost;
        String userInput;

        userInput = JOptionPane.showInputDialog(null, "How many eggs would you like to buy?",
                "Message Dialog", JOptionPane.INFORMATION_MESSAGE);
        boughtEggs = Integer.parseInt(userInput);

        dozens = boughtEggs / 12;
        looseEggs = boughtEggs % 12;

        totalCost = dozens * COST_OF_A_DOZEN + looseEggs * COST_OF_A_EGG;

        JOptionPane.showMessageDialog(null, "You ordered " + boughtEggs + " eggs." +
        "That's " + dozens + " Dozen at $3.25 per dozen and " + looseEggs + " Loose eggs at 45 cents each for a total of " + totalCost + ".");



    }
}
