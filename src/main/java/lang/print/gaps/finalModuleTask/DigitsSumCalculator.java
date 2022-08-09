package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        //1234
        int res = number%10 + number/10%10 + number/100%10 + number/1000;
        System.out.println(res);
    }
}
