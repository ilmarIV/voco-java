package week1;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Ex21 obj = new Ex21();

        UserInput userInput  = obj.new UserInput();
        int input = userInput.getInput();

        LeapYearFinder leapYearFinder = obj.new LeapYearFinder(input);
        boolean isLeap = leapYearFinder.getIsLeap();

        System.out.println(input + (isLeap ? " is leap year." : " is not leap year."));
    }

    private class UserInput {
        private int input;

        private UserInput() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a year: ");
            this.input = sc.nextInt();
        }

        private int getInput() {
            return this.input;
        }
    }

    private class LeapYearFinder {
        private int year;
        private boolean isLeap;

        private LeapYearFinder(int year) {
            this.year = year;
            isLeap();
        }

        private boolean getIsLeap() {
            return (this.isLeap);
        }

        private void isLeap() {
            this.isLeap = (this.year % 4 == 0 && (this.year % 100 != 0 || this.year % 400 == 0));
        }
    }
}
