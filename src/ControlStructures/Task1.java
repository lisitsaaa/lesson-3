package ControlStructures;

public class Task1 {
    public void taskAboutMonthWithSwitchCase(int num) {

        switch (num) {
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Spring");
                break;
            case 3:
                System.out.println("Summer");
                break;
            case 4:
                System.out.println("Fall");
                break;
            default:
                System.out.println("You wrote down an incorrect number. Try again :)");
        }
    }
}
