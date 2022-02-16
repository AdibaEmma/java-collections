package com.aweperi.codewars;

public class CamelCase {
    static String toCamelCase(String s){
        if (s == null)
            return null;

        StringBuilder sb = new StringBuilder();
        boolean nextCapital = false;
        for(int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i))) {
                char tmp  = s.charAt(i);
                if(nextCapital) tmp = Character.toUpperCase(tmp);
                sb.append(tmp);
                nextCapital = false;
            } else {
                nextCapital = true;
            }

        }

        return sb.toString();
    }
}
