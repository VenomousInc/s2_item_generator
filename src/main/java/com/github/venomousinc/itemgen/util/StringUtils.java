package com.github.venomousinc.itemgen.util;

public final class StringUtils {

    /**
     * @param s The String to capitalize properly.
     * @return Lowercase String, with the first letter of each separated word capitalized.
     */
    public static String capitalize(String s) {
        if(s == null || s.length() == 0)
            return s;
        String[] words = s.toLowerCase().split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < words.length; i++) {
            if(i != 0) {
                sb.append(' ');
            }
            sb.append(Character.toUpperCase(words[i].charAt(0)));
            if(words[i].length() > 1) {
                sb.append(words[i].substring(1));
            }
        }

        return sb.toString();
    }

}
