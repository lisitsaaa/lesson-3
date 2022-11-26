package Cycles;

public class Task8 {
    public void taskSum(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num;
            num--;
        }
        System.out.println(sum);
    }
}
