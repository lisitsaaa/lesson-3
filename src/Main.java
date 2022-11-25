import AdditionalTasks.Task12;
import AdditionalTasks.Task13;
import AdditionalTasks.Task14;
import ControlStructures.*;
import Cycles.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        Task3 t3 = new Task3();
        Task4 t4 = new Task4();
        Task5 t5 = new Task5();
        Task6 t6 = new Task6();
        Task7 t7 = new Task7();
        Task8 t8 = new Task8();
        Task9 t9 = new Task9();
        Task10 t10 = new Task10();
        Task11 t11 = new Task11();
        Task12 t12 = new Task12();
        Task13 t13 = new Task13();
        Task14 t14 = new Task14();

        int answer = 0;
        int num;

        while (answer != 15) {
            System.out.print("""
                    CONTROL STRUCTURES\t\tCYCLES\t\t\t\tADDITIONAL TASKS
                    1 - task 1.1\t\t\t6 - task 2.1\t\t12 - task 3.1
                    2 - task 1.2\t\t\t7 - task 2.2\t\t13 - task 3.2
                    3 - task 1.3\t\t\t8 - task 2.3\t\t14 - task 3.3
                    4 - task 1.4\t\t\t9 - task 2.4
                    5 - task 1.5\t\t\t10 - task 2.5
                    \t\t\t\t\t\t11 - task 2.6
                    ------------------------------------------------>15 - EXIT
                    Your choice:\s""");
            answer = input.nextInt();

            switch (answer) {
                case 1 -> {
                    System.out.println("Task 1.1\nEnter a number from 1 to 12: ");
                    num = input.nextInt();
                    t1.taskAboutMonthWithSwitchCase(num);
                }
                case 2 -> {
                    System.out.println("Task 1.2\nEnter a number from 1 to 12: ");
                    num = input.nextInt();
                    t2.taskAboutMonthWithIfElse(num);
                }
                case 3 -> {
                    System.out.print("Task 1.3\nEnter a number: ");
                    num = input.nextInt();
                    t3.taskAboutEvenAndUnevenNumbers(num);
                }
                case 4 -> {
                    System.out.print("Task 1.4\nEnter a temperature: ");
                    num = input.nextInt();
                    t4.taskAboutTemperature(num);
                }
                case 5 -> {
                    System.out.print("Task 1.5\nEnter a number (1-7) and get a color: ");
                    num = input.nextInt();
                    t5.taskAboutRainbow(num);
                }
                case 6 -> {
                    System.out.println("Task 2.1");
                    t6.taskAboutUnevenNumbers();
                }
                case 7 -> {
                    System.out.println("Task 2.2");
                    t7.taskAboutDecrement();
                }
                case 8 -> {
                    System.out.print("Task 2.3\nEnter a positive number: ");
                    num = input.nextInt();
                    if (num >= 0) {
                        t8.taskSum(num);
                    } else System.out.println("Your number is negative. Try again :)");
                }
                case 9 -> {
                    System.out.println("Task 2.4");
                    t9.taskAboutSevenMultiplyNumbers();
                }
                case 10 -> {
                    System.out.println("Task 2.5");
                    t10.taskAboutMinusSeven();
                }
                case 11 -> {
                    System.out.println("Task 2.6");
                    t11.task2_6();
                }
                case 12 -> {
                    System.out.println("Task 3.1");
                    t12.Fibonachchi();
                }
                case 13 -> {
                    System.out.println("Task 3.2");

                }
                case 14 -> System.out.println("Task 3.3");

                case 15 -> System.out.println("bye!");
            }
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        }
    }
}