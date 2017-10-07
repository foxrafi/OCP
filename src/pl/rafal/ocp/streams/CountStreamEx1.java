package pl.rafal.ocp.streams;

import java.util.stream.Stream;

public class CountStreamEx1 {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("a","b","c","d","e");
        System.out.println(s.count());

        s = Stream.of("f","g","h");
        System.out.println(s.count());
    }

}
