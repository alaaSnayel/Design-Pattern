public class App {
    public static void main(String[] args) throws Exception {
        Counter c1 = Counter.getInstance();
        Counter c2 = Counter.getInstance();

        c1.increment();
        c2.increment();

        System.out.println(c1.getCount()); 
        System.out.println(c1 == c2);       

    }
}
