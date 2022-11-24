import ControlStructures.*;
import Cycles.Task6;

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
                case 1:
                    System.out.println("Task 1.1\nEnter a number from 1 to 12: ");
                    num = input.nextInt();

                    t1.task1(num);
                    break;

                case 2:
                    System.out.println("Task 1.2\nEnter a number from 1 to 12: ");
                    num = input.nextInt();

                    t2.task2(num);
                    break;

                case 3:
                    System.out.print("Task 1.3\nEnter a number: ");
                    num = input.nextInt();

                    t3.task3(num);
                    break;

                case 4:
                    System.out.print("Task 1.4\nEnter a temperature: ");
                    num = input.nextInt();

                    t4.task4(num);
                    break;

                case 5:
                    System.out.print("Task 1.5\nEnter a number (1-7) and get a color: ");
                    num = input.nextInt();

                    t5.task5(num);
                    break;

                case 6:
                    System.out.println("Task 2.1");

                    t6.task6();
                    break;

                case 7:
                    System.out.println("Task 2.2");
                    break;

                case 8:
                    System.out.println("Task 2.3");
                    break;

                case 9:
                    System.out.println("Task 2.4");
                    break;

                case 10:
                    System.out.println("Task 2.5");
                    break;

                case 11:
                    System.out.println("Task 2.6");
                    break;

                case 12:
                    System.out.println("Task 3.1");
                    break;

                case 13:
                    System.out.println("Task 3.2");
                    break;

                case 14:
                    System.out.println("Task 3.3");
                    break;

                case 15:
                    System.out.println("bye!");
                    break;
            }
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        }
    }
}