package Cycles;

public class Task10 {
    public void taskAboutMinusSeven() {
        int a = 0;
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                System.out.println();
            }
            System.out.print("|(" + i + ") -> " + a + "|\t");
            a -= 5;
        }
        System.out.println();
    }
}
