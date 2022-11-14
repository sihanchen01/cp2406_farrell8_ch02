import javax.swing.*;

public class NauticalMilesInteractive {

    public static void main(String[] args) {
        final double KM_IN_NAUTICAL_MILE = 1.852;
        final double MILE_IN_NAUTICAL_MILE = 1.150779;
        double nautical_miles;

        nautical_miles = Double.parseDouble(JOptionPane.showInputDialog("How many nautical miles? "));

        JOptionPane.showMessageDialog(null,
                String.format(
                    "%s nautical miles is equivalent of %.4f kilometers, or %.4f miles. " +
                            "(results are rounded to 4 decimals)",
                    nautical_miles, nautical_miles * KM_IN_NAUTICAL_MILE, nautical_miles * MILE_IN_NAUTICAL_MILE
                ));
    }
}
