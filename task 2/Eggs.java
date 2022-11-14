import javax.swing.*;

public class Eggs {
    public static void main(String[] args) {
        final double DOZEN_EGGS_PRICE = 3.25;
        final double SINGLE_EGG_PRICE = 0.45;
        int numberOfEggs;

        numberOfEggs = Integer.parseInt(JOptionPane.showInputDialog("How many eggs do you want? "));

        JOptionPane.showMessageDialog(null,
                String.format(
                        "%s eggs\n -> %s dozen @ $3.25 each\n -> %s loose eggs @ $0.45 each.\n"
                        + "Total: $%s",
                        numberOfEggs, numberOfEggs / 12, numberOfEggs % 12,
                        3.25 * (numberOfEggs / 12) + 0.45 * (numberOfEggs % 12)
                ));
    }
}
