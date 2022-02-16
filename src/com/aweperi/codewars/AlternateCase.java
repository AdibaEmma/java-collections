package com.aweperi.codewars;

import java.util.ArrayList;
import java.util.List;

public class AlternateCase {
    static String alternateCase(final String string) {
        StringBuilder sb = new StringBuilder();
        char tmp;
        List<Character> list = new ArrayList<Character>();
        for(char c : string.trim().toCharArray()) {
            list.add(c);
        }
        for (char c: list) {
            if(Character.isLowerCase(c)) {
                tmp = Character.toUpperCase(c);
            }
            tmp = Character.toLowerCase(c);
            sb.append(tmp);
        }
        return sb.toString();
    }
}
