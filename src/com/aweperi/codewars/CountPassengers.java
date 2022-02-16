package com.aweperi.codewars;

import java.util.ArrayList;

public class CountPassengers {
    public static int countPassengers(ArrayList<int[]> stops) {

        var passengersLeft = 0;
        for (int[] stop : stops) {
            var first_term = stop[0];

            var second_term = stop[1];

            passengersLeft += first_term + second_term;
        }
        return passengersLeft;
    }
}
