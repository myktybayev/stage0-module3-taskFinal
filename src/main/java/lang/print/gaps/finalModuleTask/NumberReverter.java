package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
//        given -> 489, expected -> 984
        int res = (number % 10)*100+ 10 * (number/10%10) + number/100;
        System.out.println(res);
    }
}
