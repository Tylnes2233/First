public class Counter {
    public long current(long number) {
        return number;
    }
    public long next(long number) {
        number++;
        return number;
    }
    public long prev(long number) {
        number--;
        return number;
    }

    public static void main(String[] args) {
        Counter c = new Counter();
        System.out.println("current(5) =  " + c.current(5));
        System.out.println("next(5) =  " + c.next(5));
        System.out.println("prev(5) =  " + c.prev(5));
    }
}