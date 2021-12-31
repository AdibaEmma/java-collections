package com.aweperi.polymorphism;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> depths = List.of(199,
                200,
                208,
                210,
                200,
                207,
                240,
                269,
                260,
                263, 266,678,9878);

        System.out.println(getDepthIncrease(depths));
    }

    public static int getDepthIncrease(List<Integer> depths) {
        int depthIncreaseCount = 0;
        for(int i = 1; i < depths.size(); i++) {
            var previousValue = depths.get(i - 1);
            var nextValue = depths.get(i);

            if(nextValue > previousValue)
                depthIncreaseCount++;
        }
        return depthIncreaseCount;
    }
}
