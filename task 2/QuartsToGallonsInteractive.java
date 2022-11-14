import javax.swing.*;

public class QuartsToGallonsInteractive {

    public static void main(String[] args) {
        double quartsInput;
        final int QUARTS_IN_GALLON = 4;
        quartsInput = Double.parseDouble(JOptionPane.showInputDialog("How many quarts do you need? "));

        JOptionPane.showMessageDialog(null,
            String.format(
                "The painting job requires %s quarts, which is %.2f gallons and %.2f quarts. " +
                        "(results are rounded to 2 decimals)",
                quartsInput, quartsInput / QUARTS_IN_GALLON, quartsInput % QUARTS_IN_GALLON)
            );
    }
}
