
public class Sum {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int result = add(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + result);
    }

    public static int add(int x, int y) {
        return x + y;
    }
}