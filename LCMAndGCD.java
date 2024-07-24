public class LCMAndGCD {
    public static void main(String[] args) {
        int[] numbers = {16, 20};
        int gcd = findGCD(numbers[0], numbers[1]);
        int lcm = findLCM(numbers[0], numbers[1], gcd);

        for (int i = 2; i < numbers.length; i++) {
            gcd = findGCD(gcd, numbers[i]);
            lcm = findLCM(lcm, numbers[i], gcd);
        }

        System.out.println("LCM = " + lcm);
        System.out.println("GCD = " + gcd);
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public static int findLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}