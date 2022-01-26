package com.aweperi.codewars;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        var calculator = new TaxCalculatorImpl(10_000);
//        var report = new TaxReport();
//        report.show(calculator);
//
////        report.setCalculator(new TaxCalculatorImpl2());
//        report.show(new TaxCalculatorImpl2());



        getGreatestNumber(2,5,8);
        System.out.println(calculateFactorial(5));

        confirmPrimeNumber(2);

        displayFibonacciSequence();

        var list = new ArrayList<int[]>();

        list.add(new int[]{10, 0});
        list.add(new int[]{3, 5});
        list.add(new int[]{2, 5});

        System.out.println(countPassengers(list));

        System.out.println(sortDesc(143435));

        String str = "hey_there";

        System.out.println(toCamelCase(str));

        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 3, 2}, new int[]{1})));

        System.out.println(find(new int[] {1312,4313,3434,4545}));

        System.out.println(oddOrEven(new int[] {1,4,7,8,9}));

        System.out.println(getVowelCount("aeiouaeiouaeiouaeiou"));

        System.out.println(Arrays.toString("aadfffff".chars().mapToObj(c -> (char) c).map(c -> Character.toUpperCase(c)).toArray()));
        System.out.println(number(Arrays.asList("a", "b", "c")));

        StringBuilder sb = new StringBuilder();
        var name = "emmaAdiba";

        var result = name.split("[A-Z]", 5);
        System.out.println(Arrays.toString(result));
        System.out.println(name.replaceAll("([A-Z])", " $1"));
        var n = "12345";
        StringBuilder fake = new StringBuilder();
        for (char a: n.toCharArray()) {
            if (a >= '5') {
                fake.append('1');
            }
            else {
                fake.append('0');
            }
        }
        System.out.println(fake);

        var nd = Integer.toBinaryString(123);
        int counter = 0;
        for (char c: nd.toCharArray()) {
            if(c == '1') counter++;
        }
        System.out.println(nd);
        System.out.println(counter);

        String words = "I am a boy";
        ArrayList<Integer> lengths = new ArrayList<Integer>();
        var wordsArray = words.split(" ");
        System.out.println(Arrays.toString(wordsArray));
        for (String word: wordsArray) {
            lengths.add(word.length());
        }

        System.out.println(josephusPermutation(List.of(1,2,3,4,5,6,7),3));

//        System.out.println(longestSlideDown(new int[][]{{3}, {7, 4}, {2, 4, 6}, {8, 5, 9, 3}}));
        System.out.println(longestSlideDown(new int[][]{
                {75},
                {95, 64},
                {17, 47, 82},
                {18, 35, 87, 10},
                {20, 4, 82, 47, 65},
                {19, 1, 23, 75, 3, 34},
                {88, 2, 77, 73, 7, 63, 67},
                {99, 65, 4, 28, 6, 16, 70, 92},
                {41, 41, 26, 56, 83, 40, 80, 70, 33},
                {41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
                {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
                {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
                {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
                {63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
                {4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23}}));

        System.out.println(toJadenCase(null));
    }

    public static String toJadenCase(String phrase){
        if(phrase.isEmpty()){
            return  null;
        }

        //Get the various digits from the words
        char[] characters = phrase.toCharArray();
        boolean IsSpaceFound = true;

        //loop through the characters
        for(int i = 0; i < characters.length; i++){

            if(Character.isLetter(characters[i])){
                //Check to see if there is a space
                if(IsSpaceFound){

                    characters[i] = Character.toUpperCase(characters[i]);
                    IsSpaceFound = false;
                }
            }  else{
                IsSpaceFound = true;
            }
        }

        phrase = String.valueOf(characters);
        return  phrase;
    }

    public static int longestSlideDown(int[][] pyramid) {
        int[][] sum =pyramid;

        for (int i = pyramid.length - 2; i >= 0; i--) {
            for (int j = 0; j < pyramid[i].length; j++) {
                sum[i][j] = pyramid[i][j] + Math.max(pyramid[i + 1][j], pyramid[i + 1][j + 1]);
            }
        }
        return sum[0][0];
    }

    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        List<T> result = new ArrayList<T>(items.size());
        List<Integer> people = new ArrayList<>(items.size());
        int index = 0;
        for(int i = 0;i < items.size();i++){
            people.add(i);
        }

        while (people.size() > 0) {
            index = (index + k - 1) % people.size();
            result.add(items.get(people.get(index)));
            people.remove(index);
        }
        return result;
    }

    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        List<Integer> ageList = List.of(age1,age2,age3,age4,age5,age6,age7,age8);
        return (int) (Math.floor(Math.sqrt(ageList.stream().map(a -> a * a).reduce(0, Integer::sum))) / 2);
    }

    @Contract(pure = true)
    public static @NotNull
    String bmi(double weight, double height) {
        double bmi = weight / height * height;

        if (bmi <= 18.5) {
            return "Underweight";
        } else if (bmi <= 25.0) {
            return "Normal";
        } else if (bmi <= 30.0) {
            return "Overweight";
        } else if (bmi > 30) {
            return "Obese";
        } else {
            return "BMI cannot be calculated";
        }
    }

    public static List<String> number(List<String> lines) {
        List<String> newList = new ArrayList<String>();
        for (int i = 0; i < lines.size(); i++) {
            var line = String.format("%s: %s", i + 1, lines.get(i));
            newList.add(line);
        }
        return newList;
//        return lines.stream().map(c ->  String.format("%s: %s", lines.indexOf(c) + 1, c)).collect(Collectors.toCollection(ArrayList::new));

    }

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

    public static int getVowelCount(String str) {
//        int vowelsCount = 0;
//        var result = str.toCharArray();
//        for (char r: result) {
//            if(r == 'a' || r == 'e' || r == 'i' || r == 'o' || r == 'u') vowelsCount++;
//        }
//        return vowelsCount;

        return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
    }

    static int find(int[] integers){
        ArrayList<Integer> listIntegers = Arrays.stream(integers).boxed().collect(Collectors.toCollection(ArrayList::new));
        listIntegers.stream().min(Integer::compare).get();
        var outlier = 0;
        for ( int i: integers) {
            if (i % 2 == 0) {
                outlier = i;
            } else {
                outlier = i;
            }

        }
        return outlier;
//        return listIntegers.stream().filter(c -> c % 2 != 0 ).findFirst().get();
    }

    public static String oddOrEven (int[] array) {
        String outlier = "";
        int result = 0;
        for (int a: array) {
            result+=a;
        }
        if(result % 2 == 0) {
            outlier = "even";
        } else {
            outlier = "odd";
        }
        return outlier;
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        ArrayList<Integer> list_of_a = Arrays.stream(a).boxed().collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> list_of_b = Arrays.stream(b).boxed().collect(Collectors.toCollection(ArrayList::new));

        return list_of_a.stream().filter(v -> !list_of_b.contains(v)).mapToInt(Integer::intValue).toArray();

    }

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

    public static void getGreatestNumber(int a, int b, int c) {
        if ( a > b ) {
            if ( a > c ) {
                System.out.println("the first number is the greatest");
            }
            else {
                System.out.println("the third number is the greatest");
            }
        }
        else {
            if ( b > c ) {
                System.out.println("the second number is the greatest");
            }
            else {
                System.out.println("the third number is the greatest");
            }
        }
    }

    public static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void confirmPrimeNumber(int n) {
        int flag = 1;
        for (int i = 2; i <= n/2; i++) {
            if (n / i == 0) {
                flag = 0;
                break;
            }
        }
        if ( flag == 0) {
            System.out.println(n + " is not a prime number");
        }
        else {
            System.out.println(n + " is a prime number");
        }
    }

    public static void displayFibonacciSequence() {
        int first_term = 0;
        int second_term = 1;
        int temp;

        while ( second_term < 1000) {
            temp = second_term;
            second_term = first_term + second_term;

            first_term = temp;
            System.out.println(second_term);
        }
    }

    public static int countPassengers(ArrayList<int[]> stops) {

        var passengersLeft = 0;
        for (int[] stop : stops) {
            var first_term = stop[0];

            var second_term = stop[1];

            passengersLeft += first_term + second_term;
        }
        return passengersLeft;
    }

//    public static String whoLikesIt(String... names) {
//        var size = names.length;
//        switch (true) {
//            case size == 1 -> {
//                return names[0] + " likes this";
//            }
//            case  size > 2  -> {
//                return names[0] + " and " + names[1] + " likes this";
//            }
//            case size > 4 -> {
//
//            }
//        }
//        return "";
//    }

    public static int sortDesc(final int num) {
        var values = String.valueOf(num).toCharArray();
        char[] sortedValues = new char[values.length];
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] > values[i + 1]) {
                sortedValues[i] = values[i];
            }
            else{
                sortedValues[i] = values[i + 1];
            }
        }
        return 0;
    }
}
