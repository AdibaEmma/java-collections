package com.aweperi.codewars;

public class LongestSlideDown {
    public static int longestSlideDown(int[][] pyramid) {
        int[][] sum =pyramid;

        for (int i = pyramid.length - 2; i >= 0; i--) {
            for (int j = 0; j < pyramid[i].length; j++) {
                sum[i][j] = pyramid[i][j] + Math.max(pyramid[i + 1][j], pyramid[i + 1][j + 1]);
            }
        }
        return sum[0][0];
    }
}
