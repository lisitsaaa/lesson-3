package AdditionalTasks;

public class Task12 {
    public void Fibonachchi() {
        int a = 1;
        int b = 0;

        for (int i = 1; i <= 11; i++) {
            System.out.print(a + "\t");
            a = a + b;
            b = a - b;
        }

        System.out.println();
    }
}
