package day18_conditions_practice_strings_intro;

import java.util.Scanner;

public class MultiBranchIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type your number = ");
        int number = scan.nextInt();
        if (number > 0) {
            System.out.println(number + " number is positive");
        } else if (number < 0) {
            System.out.println(number + " number is negative");
        } else {
            System.out.println(number + " Number is zero");
        }

    }
}
