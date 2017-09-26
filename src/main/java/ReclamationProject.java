/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 * @author yfy
 *
 */
public class ReclamationProject {
    /**
     *
     * @param args a
     */
    public static void main(final String[] args) {
        System.out.println(doit("homework", "homework sucks!"));
    }
    /**
     *
     * @param a longer string
     * @param b shorter string
     * @return same consecutive combined in a and b
     */
    static String doit(final String a, final String b) {
        //if a has more characters than b, exchange the value of a and b
        String shorterString = "";
        String longerString = "";
        if (a.length() > b.length()) {
            longerString = a;
            shorterString  = b;
        }
        String sameCharactersCombo = "";
        if (a.equals(b)) {
            sameCharactersCombo = "";
        }
        /*
         * For loop with i
         */
        for (int i = 0; i < shorterString.length(); i++) {
            for (int j = shorterString.length() - i; j > 0; j--) {
                for (int k = 0; k < longerString.length() - j; k++) {
                    if (shorterString.regionMatches(i, longerString, k, j)
                            && j > sameCharactersCombo.length()) {
                        sameCharactersCombo = shorterString.substring(i, i + j);
                    }
                } // Ah yeah
            }
        }
        return sameCharactersCombo;
    }
}
