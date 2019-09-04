import javax.swing.*;

public class Initials {

    public static void main(String[] args){

        String firstInitial;
        String middleInitial;
        String lastInitial;

        firstInitial = JOptionPane.showInputDialog(null, "What is your First Initial?",
                "Message Dialog", JOptionPane.INFORMATION_MESSAGE);
        middleInitial = JOptionPane.showInputDialog(null, "What is your Middle Initial?",
                "Message Dialog", JOptionPane.INFORMATION_MESSAGE);
        lastInitial = JOptionPane.showInputDialog(null, "What is your Last Initial?",
                "Message Dialog", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Your initials are " + firstInitial + "." +
                middleInitial +  "." + lastInitial + "." );

    }
}
