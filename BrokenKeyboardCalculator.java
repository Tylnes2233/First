class BrokenKeyboardCalculator {
public int add(int a, int b){
    a += b;
    return a;
}
public int sub(int a, int b){
    a -= b;
    return a;
}
public int multiply(int a, int b){
    a *= b;
    return a;
}
public int divide(int a, int b){
    a /= b;
    return a;
}

    public static void main(String[] args) {
    BrokenKeyboardCalculator calc = new BrokenKeyboardCalculator();
        System.out.println("add = " + calc.add(10, 5));
        System.out.println("sub = " + calc.sub(8, 7));
        System.out.println("multiply = " + calc.multiply(1, 100));
        System.out.println("divide = " + calc.divide(8, 4));
    }
}