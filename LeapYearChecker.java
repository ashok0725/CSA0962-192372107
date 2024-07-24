public class LeapYearChecker {
    public static void main(String[] args) {
        int year = 1947;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Given year is a Leap Year");
        } else {
            System.out.println("Given year is a Non Leap Year");
        }
    }
}