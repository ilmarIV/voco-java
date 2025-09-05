package week1;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Ex16 obj = new Ex16();
        InputComparator inputComparator = obj.new InputComparator();
        inputComparator.setInput();
        inputComparator.setIsEvenOrOdd();
        String evenOrOdd = inputComparator.isEvenOrOdd;
        System.out.println("Number is " + evenOrOdd);
    }
    private class InputComparator {
        private int  input = 0;
        private String isEvenOrOdd = "undefined";

        private void setInput() {
            Scanner sc = new Scanner(System.in);
            input = sc.nextInt();
            sc.close();
        }

        private void setIsEvenOrOdd() {
            if (input % 2 == 0) {
                isEvenOrOdd = "Even";
            } else {
                isEvenOrOdd = "Odd";
            }
        }
    }
}