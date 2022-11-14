public class QuartsToGallons {
    public static void main(String[] args) {
        final int QUARTS_IN_GALLON = 4;
        int QUARTS_NEEDED = 18;

        System.out.println("The painting job requires " + Integer.toString(QUARTS_NEEDED) + " quarts, which is "
            + Integer.toString(QUARTS_NEEDED / QUARTS_IN_GALLON) + " gallons and "
            + Integer.toString(QUARTS_NEEDED % QUARTS_IN_GALLON) + " quarts.");

    }
}
