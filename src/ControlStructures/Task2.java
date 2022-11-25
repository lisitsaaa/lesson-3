package ControlStructures;

public class Task2 {
    public void taskAboutMonthWithIfElse(int num) {
        if ((num >= 3) && (num <= 5)) {
            System.out.println("SPRING");
            if (num == 3) {
                System.out.println("it's march");
            } else if (num == 4) {
                System.out.println("it's april");
            } else {
                System.out.println("it's may");
            }
        } else if ((num >= 6) && (num <= 8)) {
            System.out.println("SUMMER");
            if (num == 6) {
                System.out.println("it's june");
            } else if (num == 7) {
                System.out.println("it's july");
            } else {
                System.out.println("it's august");
            }
        } else if ((num >= 9) && (num <= 11)) {
            System.out.println("FALL");
            if (num == 9) {
                System.out.println("it's september");
            } else if (num == 10) {
                System.out.println("it's october");
            } else {
                System.out.println("it's november");
            }
        } else if ((num == 1) || (num == 2) || (num == 12)) {
            System.out.println("WINTER");
            if (num == 1) {
                System.out.println("it's january");
            } else if (num == 2) {
                System.out.println("it's february");
            } else {
                System.out.println("it's december");
            }
        } else {
            System.out.println("You wrote down an incorrect number. Try again :)");
        }
    }
}
