import java.util.Scanner;

public class InterestRate {
	public static double calculateInterestFirstYear(double deposits) {
		final double interestRateFirstYear = 0.075;
		return deposits * interestRateFirstYear / 12;
	}

	public static double calculateInterestAfterFirstYear(double deposits) {
		final double interestRateAfterFirstYear = 0.11;
		return deposits * interestRateAfterFirstYear / 12;
	}

	public static double calculateDepositsPerMonth(double deposits, int months) {
		return deposits / months;
	}

	public static void main(String[] args) {
		double deposits;
		int months = 60;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount you want to borrow: ");
		deposits = scanner.nextDouble();
		System.out.println("Enter the number of months you want to pay: ");
		months = scanner.nextInt();
		if (months <= 12) {
			System.out.println("The amount of money to pay monthly: "
					+ (calculateInterestFirstYear(deposits) + calculateDepositsPerMonth(deposits, months)));
		} else {
			System.out.println("The amount of money to pay monthly first year:"
					+ (calculateInterestFirstYear(deposits) + calculateDepositsPerMonth(deposits, months)));
			System.out.println("The amount of money to pay monthly of following years: "
					+ (calculateDepositsPerMonth(deposits, months) + calculateInterestAfterFirstYear(deposits)));
		}

	}

}
