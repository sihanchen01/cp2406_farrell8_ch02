import javax.swing.*;

public class MinutesConversion {
    public static void main(String[] args) {
        double hours;
        double days;
        double numberOfMinutes = Double.parseDouble(JOptionPane.showInputDialog("Enter a number of minutes: "));
        String outputMessage = String.format("%s minutes equals %.2f hours, or %.2f days.",
                numberOfMinutes, minutesToHours(numberOfMinutes), minutesToDays(numberOfMinutes));
        JOptionPane.showMessageDialog(null, outputMessage);
    }

    private static double minutesToHours(double minutes) {
        return minutes / 60;
    }

    private static double minutesToDays (double minutes) {
        return (minutes / 60) / 24;
    }
}
