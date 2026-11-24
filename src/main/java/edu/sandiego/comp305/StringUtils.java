package edu.sandiego.comp305;

/**
 * A class that's purpose is to make utility functions for use with strings
 */
public final class StringUtils {
    private StringUtils() {
    }

    /**
     * This method reverses a string
     *
     * @param string the string that's being reversed
     * @return the reversed string or null if nothing is there
     */
    public static String reverseString(final String string){
        if (string == null) {
            return null;
        }
        return new StringBuilder(string).reverse().toString();
    }
}
