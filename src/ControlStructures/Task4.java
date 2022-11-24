package ControlStructures;

public class Task4 {

    public static void task4(int num){
        if (num > -5) {
            System.out.println("warm");
        } else if ((num <= -5) &&
                (num > -20)) {
            System.out.println("norm");
        } else if (num <= -20) {
            System.out.println("freeze");
        }
    }
}
