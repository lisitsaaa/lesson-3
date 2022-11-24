package ControlStructures;

public class Task5 {

    public void taskAboutRainbow(int num){
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
    }
}
