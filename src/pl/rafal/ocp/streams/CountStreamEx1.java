package pl.rafal.ocp.streams;

import java.util.stream.Stream;

public class CountStreamEx1 {

    public static void main(String[] args) {

        pr("Let's create a stream containing 5 elements...");
        Stream<String> s = Stream.of("a","b","c","d","e");

        pr("Let's display the number of elements in this stream...");
        pr("Size: " + s.count());      //it should be 5

        pr("Let's assign a new 3-element stream to the reference variable used earlier to refer to the 5-element stream...");
        s = Stream.of("f","g","h");

        pr("Let's display the number of elements from the new stream...");
        pr("Size: " + s.count());      //it should be 3

    }

    private static void pr(String str){
        System.out.println(str);
    }

}
