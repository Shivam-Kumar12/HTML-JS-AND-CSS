public class Main1 {
    public static void main(String[] args) {
        exceptionDemo ed = new exceptionDemo();
        try {
            ed.test(15);
        } catch (UnderAge e) {
            System.out.println(e);
        }
    }
}
