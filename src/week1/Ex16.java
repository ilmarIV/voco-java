package week1;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Ex16 obj = new Ex16();
        int input = obj.getInput();
        String evenOrOdd = obj.isEvenOrOdd(input);
        System.out.println("Number is " + evenOrOdd);
    }

    private int getInput() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        return input;
    }

    private String isEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}