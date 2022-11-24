import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Task2 t2 = new Task2();

        int answer = 1;
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
                    System.out.print("Task 1.1\n Enter a number from 1 to 12: ");
                    num = input.nextInt();
                    switch (num) {
                        case 1:
                            System.out.println("It's January");
                            break;
                        case 2:
                            System.out.println("It's February");
                            break;
                        case 3:
                            System.out.println("It's March");
                            break;
                        case 4:
                            System.out.println("It's April");
                            break;
                        case 5:
                            System.out.println("It's May");
                            break;
                        case 6:
                            System.out.println("It's June");
                            break;
                        case 7:
                            System.out.println("It's July");
                            break;
                        case 8:
                            System.out.println("It's August");
                            break;
                        case 9:
                            System.out.println("It's September");
                            break;
                        case 10:
                            System.out.println("It's October");
                        case 11:
                            System.out.println("It's November");
                            break;
                        case 12:
                            System.out.println("It's December");
                            break;
                        default:
                            System.out.println("You wrote down an incorrect number. Try again :)");
                            break;
                    }
                    break;

                case 2:
                    t2.task2();
                    break;

                case 3:
                    System.out.print("Task 1.3\nEnter a number: ");
                    num = input.nextInt();

                    if (num % 2 == 0) {
                        System.out.println(num + " - even");
                    } else System.out.println(num + " - uneven");
                    break;

                case 4:
                    System.out.print("Task 1.4\nEnter a temperature: ");
                    num = input.nextInt();
                    if (num > -5) {
                        System.out.println("warm");
                    } else if (num <= -5 && num > -20) {
                        System.out.println("norm");
                    } else if (num <= -20) {
                        System.out.println("freeze");
                    }
                    break;
                case 5:
                    System.out.print("Task 1.5\nEnter a number (1-7) and get a color: ");
                    num = input.nextInt();
                    switch (num) {
                        case 1:
                            System.out.println("red");
                            break;
                        case 2:
                            System.out.println("orange");
                            break;
                        case 3:
                            System.out.println("yellow");
                            break;
                        case 4:
                            System.out.println("green");
                            break;
                        case 5:
                            System.out.println("blue");
                            break;
                        case 6:
                            System.out.println("dark blue");
                            break;
                        case 7:
                            System.out.println("purple");
                            break;
                        default:
                            System.out.println("sorry! you give me an incorrect number :( Try again");
                    }
                    break;
                case 6:
                    System.out.println("Task 2.1");
                    for (int i = 1; i <= 99; i++) {
                        int a = i % 2;
                        if (a == 1) {
                            System.out.println(i);
                        }
                    }
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