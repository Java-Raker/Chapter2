import javax.swing.*;

public class MadLibs {

    public static void main(String[] args){

        String color;
        String estWord;
        String bodyPart;
        String animal;
        String aNoun;
        String pluralNoun;
        int a;
        int b;
        int c;
        String inputA;
        String inputB;
        String inputC;


        color = JOptionPane.showInputDialog(null, "Pick a color",
                "Color", JOptionPane.INFORMATION_MESSAGE);
        estWord = JOptionPane.showInputDialog(null, "Pick a word ending in EST",
                "est word", JOptionPane.INFORMATION_MESSAGE);
        bodyPart = JOptionPane.showInputDialog(null, "Name a plural Body Part",
                "Body Part", JOptionPane.INFORMATION_MESSAGE);
        animal = JOptionPane.showInputDialog(null, "Name an animal",
                "animal", JOptionPane.INFORMATION_MESSAGE);
        aNoun = JOptionPane.showInputDialog(null, "Pick a Noun",
                "Noun", JOptionPane.INFORMATION_MESSAGE);
        pluralNoun = JOptionPane.showInputDialog(null, "Pick a plural Noun",
                "Plural Noun", JOptionPane.INFORMATION_MESSAGE);
        inputA = JOptionPane.showInputDialog(null, "Pick a number",
                "Number 1", JOptionPane.INFORMATION_MESSAGE);
        a = Integer.parseInt(inputA);
        inputB = JOptionPane.showInputDialog(null, "Pick another number",
                "Number 2", JOptionPane.INFORMATION_MESSAGE);
        b = Integer.parseInt(inputB);

        c = a % b;

        JOptionPane.showMessageDialog(null, "The " + color + " Dragon is the " + estWord +
                " Dragon of all. it has " + c + " " + bodyPart + " and a " + animal + " shaped like a " + aNoun +
                "\n. It loves to eat " + pluralNoun + ", although it will feast on nearly anything."
        );
    }
}
