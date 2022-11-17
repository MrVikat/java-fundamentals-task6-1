public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the days Countdown application");

        DateCalculator dateCalculator = new DateCalculator();


        System.out.println("Days left to Christmas: " + dateCalculator.christmas());
        System.out.println("Days left till the end of the year: " + dateCalculator.daysToYearEnd());
    }
}
