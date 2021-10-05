package codewithmosh;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        byte temp = scanner.nextByte();

        if(temp >= 30) {
            System.out.println("It's a hot day\nDrink water!");
        } else if( temp > 20) {
            System.out.println("It's a nice day");
        } else {
            System.out.println("It's cold");
        }

    }
}