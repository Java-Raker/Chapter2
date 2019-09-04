import javax.swing.*;

public class InchesToFeetInteractive {

    public static void main(String[] args){

        final int FEET = 12;
        int totalFeet;
        int remainingInches;
        int userInputInch;
        String userInputString;

        userInputString = JOptionPane.showInputDialog(null, "How many inches are there?",
                "Message Dialog", JOptionPane.INFORMATION_MESSAGE);
        userInputInch = Integer.parseInt(userInputString);

        totalFeet = userInputInch / FEET;
        remainingInches = userInputInch % FEET;

        JOptionPane.showMessageDialog(null, "Your conversion to feet comes out to be " +
        totalFeet + " and " + remainingInches + ".");



    }
}
