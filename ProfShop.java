public class ProfShop {
    public boolean isPriceOk(int price){
        boolean isPriceOk = price != 1000;
        return isPriceOk;
    }
    public float calculateRegularDiscountPrice(float price) {
        price *= 90;
        price /= 100;
        return price;
    }
    public boolean isDiscount50(int price){
        boolean isDiscount50 = price >= 1000;
        return isDiscount50;
    }
    public boolean isPriceHappy(int price, int year, int day){
        year *= day;
        boolean isPriceHappy = price == year;
        return isPriceHappy;
    }


    public static void main(String[] args) {
        ProfShop shop = new ProfShop();
        System.out.println("price = " + shop.isPriceOk(1500));
        System.out.println("regular discount = " + shop.calculateRegularDiscountPrice(1500));
        System.out.println("isDiscount50 = " + shop.isDiscount50(256));
        System.out.println("isPriceHappy = " +shop.isPriceHappy(23700, 3950, 6));
    }
}
