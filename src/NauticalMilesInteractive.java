import javax.swing.*;

public class NauticalMilesInteractive {

    public static void main(String[] args){

        final double NM_TO_MILE = 1.150779;
        final double NM_TO_KILO = 1.852;
        double userInputNM;
        double totalMiles;
        double totalKilo;
        String userInputString;

        userInputString = JOptionPane.showInputDialog(null, "How many Nautical Miles are there?",
                "Dialog Box", JOptionPane.INFORMATION_MESSAGE);
        userInputNM = Double.parseDouble(userInputString);

        totalMiles = userInputNM * NM_TO_MILE;
        totalKilo = userInputNM * NM_TO_KILO;

        JOptionPane.showMessageDialog(null, "From " + userInputNM + " Nautical Miles we get " +
        totalMiles + " Miles and " + totalKilo + " Kilometers.");





    }
}
