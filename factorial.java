public class FactorialWhile {
    public static void main(String[] args) {

        int num = 10;
        long factorial = 1;
        int i = 1;

        while (i <= num) {
            factorial = factorial * i;
            i++;
        }

        System.out.println("Factorial of 10 = " + factorial);
    }
}