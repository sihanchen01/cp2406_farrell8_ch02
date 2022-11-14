import javax.swing.*;

public class Dollars {
    public static void main(String[] args) {
        final int amountOfDollars = Integer.parseInt(JOptionPane.showInputDialog("Enter amount of money: "));
        int twenties = amountOfDollars / 20;
        int tens = (amountOfDollars % 20) / 10;
        int fives = (amountOfDollars - twenties * 20 - tens * 10) / 5;
        int ones = amountOfDollars - twenties * 20 - tens * 10 - fives * 5;

        JOptionPane.showMessageDialog(null,
                String.format(
                "20s - %s\n10s - %s\n5s  - %s\n1s  - %s", twenties, tens, fives, ones
                ));
    }
}
