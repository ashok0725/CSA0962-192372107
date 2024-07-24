public class CompositeNumbers {
    public static void main(String[] args) {
        int a = 12, b = 19;
        printCompositeNumbers(a, b);
    }

    public static void printCompositeNumbers(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (isComposite(i)) {
                System.out.print(i + (i < b ? ", " : ""));
            }
        }
    }

    public static boolean isComposite(int num) {
        if (num < 4) return false; // 0, 1, 2, 3 are not composite
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return true; // Found a divisor
        }
        return false; // Not composite
    }
}