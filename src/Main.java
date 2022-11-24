import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer = 1;

        while (answer != 15) {
            System.out.println("CONTROL STRUCTURES\t\tCYCLES\t\t\t\tADDITIONAL TASKS" +
                    "\n1 - task 1.1\t\t\t6 - task 2.1\t\t12 - task 3.1" +
                    "\n2 - task 1.2\t\t\t7 - task 2.2\t\t13 - task 3.2" +
                    "\n3 - task 1.3\t\t\t8 - task 2.3\t\t14 - task 3.3" +
                    "\n4 - task 1.4\t\t\t9 - task 2.4" +
                    "\n5 - task 1.5\t\t\t10 - task 2.5" +
                    "\n\t\t\t\t\t\t11 - task 2.6" +
                    "\n------------------------------------------------>15 - EXIT");
            answer = input.nextInt();

            switch (answer) {
                case 1:
                    System.out.println("Task 1.1");
                    break;

                case 2:
                    System.out.println("Task 1.2");
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