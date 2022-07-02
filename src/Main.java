import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String str = "ABBA...";

        System.out.println(Kata.duplicateCount(str));

        System.out.println(Kata.replaceDots(str));


            String[] strings = { "1", "2", "3", "4", "13"};

            int[] values = Stream.of(strings)
                    .mapToInt(Integer::parseInt)
                    .toArray();

            System.out.println(Arrays.toString(values));



    }
}
