import java.util.stream.Stream;

public class odd_count {

    public String winner(String[] deckSteve, String[] deckJosh) {
        for (int i = 0; i < deckSteve.length; i++) {
            if (deckSteve[i].equals("T")) {
                deckSteve[i] = "10";
            }
            if (deckSteve[i].equals("J")) {
                deckSteve[i] = "11";
            }
            if (deckSteve[i].equals("Q")) {
                deckSteve[i] = "12";
            }
            if (deckSteve[i].equals("K")) {
                deckSteve[i] = "13";
            }
            if (deckSteve[i].equals("A")) {
                deckSteve[i] = "14";
            }
        }

        for (int i = 0; i < deckJosh.length; i++) {
            if (deckJosh[i].equals("T")) {
                deckJosh[i] = "10";
            }
            if (deckJosh[i].equals("J")) {
                deckJosh[i] = "11";
            }
            if (deckJosh[i].equals("Q")) {
                deckJosh[i] = "12";
            }
            if (deckJosh[i].equals("K")) {
                deckJosh[i] = "13";
            }
            if (deckJosh[i].equals("A")) {
                deckJosh[i] = "14";
            }
        }

        int[] values1 = Stream.of(deckSteve)
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] values2 = Stream.of(deckJosh)
                .mapToInt(Integer::parseInt)
                .toArray();

        int pointSteve = 0;
        int pointJosh = 0;
        for (int i = 0; i < deckJosh.length; i++) {
            if (values1[i] > values2[i]) {
                pointSteve = pointSteve + 1;
            }
            if (values1[i] < values2[i]) {
                pointJosh = pointJosh + 1;
            }
        }

        if (pointSteve > pointJosh) {
            return "Steve wins " + pointSteve + " to " + pointJosh;
        }
        if (pointSteve < pointJosh) {
            return "Josh wins " + pointJosh + " to " + pointSteve;
        } else return "Tie";
    }
}