public class NauticalMiles {
    public static void main(String[] args) {
        final double KM_IN_NAUTICAL_MILE = 1.852;
        final double MILE_IN_NAUTICAL_MILE = 1.150779;

        double nautical_miles = 20.5;

        System.out.printf(
                "%s nautical miles is equivalent of %s kilometers, or %s miles.",
                    nautical_miles, nautical_miles * KM_IN_NAUTICAL_MILE, nautical_miles * MILE_IN_NAUTICAL_MILE
        );
    }
}
