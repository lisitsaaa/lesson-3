import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer = 1;
        int num;

        while (answer != 15) {
            System.out.print("CONTROL STRUCTURES\t\tCYCLES\t\t\t\tADDITIONAL TASKS" +
                    "\n1 - task 1.1\t\t\t6 - task 2.1\t\t12 - task 3.1" +
                    "\n2 - task 1.2\t\t\t7 - task 2.2\t\t13 - task 3.2" +
                    "\n3 - task 1.3\t\t\t8 - task 2.3\t\t14 - task 3.3" +
                    "\n4 - task 1.4\t\t\t9 - task 2.4" +
                    "\n5 - task 1.5\t\t\t10 - task 2.5" +
                    "\n\t\t\t\t\t\t11 - task 2.6" +
                    "\n------------------------------------------------>15 - EXIT" +
                    "\nYour choice: ");
            answer = input.nextInt();

            switch (answer) {
                case 1:
                    System.out.print("Task 1.1\n Enter a number from 1 to 12: ");
                    num = input.nextInt();
                    switch (num){
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
                    System.out.print("Task 1.2\nEnter a number from 1 to 12: ");
                    num = input.nextInt();
                    if (num == 1) {
                        System.out.println("It's January");
                    } else if (num == 2) {
                        System.out.println("It's February");
                    } else if (num == 3) {
                        System.out.println("It's March");
                    } else if (num == 4) {
                        System.out.println("It's April");
                    } else if (num == 5) {
                        System.out.println("It's May");
                    } else if (num == 6) {
                        System.out.println("It's June");
                    } else if (num == 7) {
                        System.out.println("It's July");
                    } else if (num == 8) {
                        System.out.println("It's August");
                    } else if (num == 9) {
                        System.out.println("It's September");
                    } else if (num == 10) {
                        System.out.println("It's October");
                    } else if (num == 11) {
                        System.out.println("It's November");
                    } else if (num == 12) {
                        System.out.println("It's December");
                    } else System.out.println("You wrote down an incorrect number. Try again :)");
                    break;

                case 3:
                    System.out.println("Task 1.3");
                    break;
                case 4:
                    System.out.println("Task 1.4");
                    break;
                case 5:
                    System.out.println("Task 1.5");
                    break;
                case 6:
                    System.out.println("Task 2.1");
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