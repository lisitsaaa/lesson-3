package AdditionalTasks;

public class Task13 {

    public void taskAboutMonthAndSum(int month, float sum) {
        for (int i = 1; i <= month; i++) {
            float a = (sum * 7) / 100;
            sum += a;
        }
        System.out.println(sum);
    }
}
