public class MarsValueConverter {
    public int changeMoneyAmount(float startAmount, float toRemove){
        float result = startAmount - toRemove;
        return Math.round(result);
    }
    public int calculateMoneySum(int sum1, int sum2){
        return sum1 + sum2;
    }
    public double halfOfMoney(double startMoney){
    int rounded = (int) Math.round(startMoney);
    return (double) rounded / 2;
    }

    public static void main(String[] args) {
        MarsValueConverter conv = new MarsValueConverter();
        System.out.println("changeMoneyAmount = " +conv.changeMoneyAmount(100f, 40.5f));
        System.out.println("calculateMoneySum = " +conv.calculateMoneySum(50, 40));
        System.out.println("halfOfMoney = "+conv.halfOfMoney(1000.9999));
    }
}
