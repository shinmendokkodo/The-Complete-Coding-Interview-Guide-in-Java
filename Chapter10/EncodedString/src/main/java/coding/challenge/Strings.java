package coding.challenge;

public final class Strings {

    private Strings() {
        throw new AssertionError("Cannot be instantiated");
    }

    public static char[] encodeWhitespaces(char[] str) {

        if (str == null) {
            throw new IllegalArgumentException("The given string cannot be null");
        }

        int countWhitespaces = 0;
        for (int i = 0; i < str.length; i++) {
            if (Character.isWhitespace(str[i])) {
                countWhitespaces++;
            }
        }
        
        if (countWhitespaces > 0) {

            char[] encodedStr = new char[str.length + countWhitespaces * 2];

            int index = 0;
            for (int i = 0; i < str.length; i++) {
                if (Character.isWhitespace(str[i])) {
                    encodedStr[index] = '0';
                    encodedStr[index + 1] = '2';
                    encodedStr[index + 2] = '%';
                    index = index + 3;
                } else {
                    encodedStr[index] = str[i];
                    index++;
                }
            }
            return encodedStr;
        }

        return str;
    }
}
