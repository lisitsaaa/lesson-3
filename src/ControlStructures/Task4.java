package ControlStructures;

public class Task4 {

    public void taskAboutTemperature(int num){
        if (num > -5) {
            System.out.println("warm");
        } else if ((num <= -5) &&
                (num > -20)) {
            System.out.println("not bad");
        } else if (num <= -20) {
            System.out.println("freeze");
        }
    }
}
