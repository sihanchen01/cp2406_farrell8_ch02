import javax.swing.*;

public class TicketNumber {
    public static void main(String[] args) {
        int userInput = Integer.parseInt(JOptionPane.showInputDialog("Enter your ticket number: "));
        String outputMessage =  verifyLastDigit(userInput) ?  "Your ticket number is valid."
                : "Your ticket number is invalid!";
        JOptionPane.showMessageDialog(null, outputMessage);
    }

    private static boolean verifyLastDigit (int number) {
        int withoutLastDigit = number / 10;
        int lastDigit = number % 10;
        return withoutLastDigit % 7 == lastDigit;
    }
}
