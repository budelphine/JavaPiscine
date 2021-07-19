import java.util.Scanner;

public class Program {
	public static int mySqrt(int num) {
		int	numSqrt = 1;

		while (numSqrt * numSqrt < num) { numSqrt++; }
		if (numSqrt * numSqrt > num) { numSqrt--; }
		return numSqrt;
	}

	public static int sumOfDigits(int num) {
		int sumOfDigits;

		sumOfDigits = 0;

		if (num < 0) { num *= -1; }

		while (num > 0) {
			sumOfDigits += num % 10;
			num = num / 10;
		}
		return sumOfDigits;
	}

	public static boolean findPrimeStatus(int num) {
		int	numSqrt = mySqrt(num);
		int	i = 2;

		if (num <= 1) {
			return false;
		}

		if (num % 2 == 0) {
			return false;
		}

		while (++i <= numSqrt) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int	coffeeRequest = 0;

		int num = in.nextInt();
		while (num != 42) {
			if (findPrimeStatus(sumOfDigits(num))) { coffeeRequest++; }
			num = in.nextInt();
		}
		in.close();

		System.out.println("Count of coffee-request - " + coffeeRequest);
	}
}