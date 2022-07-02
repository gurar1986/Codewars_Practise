public class Kata {

    public static int duplicateCount(String text) {
        text = text.toLowerCase();
        int count = 0;
        String countStr = null;
        for (int i = 0; i < text.length(); i++) {
            CharSequence a = text.subSequence(i,i+1);
            String countString = text.substring(i+1);
            String oppositeString = text.substring(0,i);
            if (countString.contains(a) && !oppositeString.contains(a)) {
                    count = count + 1;
                }
        }
        return count;
    }

    public static String replaceDots(final String str) {
        return str.replace(".","-");
    }
}


