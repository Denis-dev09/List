package com.engeto;

import java.util.ArrayList;
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers:");

        while (true) {
            int number = input.nextInt();
            if (number != -1)
                numbers.add(number);
            if (number == -1)
                break;
        }
        int greatest = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (number > greatest)
                greatest = number;
        }
        System.out.println("The greatest number: " + greatest);
        input.close();
    }
}
