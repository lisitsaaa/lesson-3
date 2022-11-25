package AdditionalTasks;

public class Task12 {
    public void Fibonachchi() {
        int i = 1;
        int j = 0;

        while (i <= 89) {
            System.out.print(i + "\t");
            i = i + j;
            j = i - j;
        }
        System.out.println();
    }
}
