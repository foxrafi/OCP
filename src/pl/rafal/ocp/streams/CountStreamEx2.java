package pl.rafal.ocp.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CountStreamEx2 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("devout", "doyenne", "dainty", "decency","architect");
        Predicate<String> predicate = s-> s.startsWith("d");
        long l = words.stream().filter(predicate).count();
        System.out.println("Number of Matching Element:" + l);

    }

}
