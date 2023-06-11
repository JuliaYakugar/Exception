package Less_01;

public class Main_01 {
    public static void main(String[] args) {
        // exc_zero(10, 0);
        // exc_length();
        exc_parse();
    }

    public static int exc_zero(int a, int b) {
        return a / b;
    }

    public static void exc_length() {
        int[] arr = new int[10];
        System.out.println(arr[100]);
    }

    public static void exc_parse() {
        System.out.println(Integer.parseInt("Hello"));
    }
}