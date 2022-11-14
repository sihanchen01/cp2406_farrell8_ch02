import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Initials {
    public static void main(String[] args) {
        List<String> initials = Arrays.asList("S", "C", "K");

        System.out.print(initials.stream().map(Objects::toString).collect(Collectors.joining(".")));
    }
}
