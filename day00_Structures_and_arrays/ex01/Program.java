import java.util.Scanner;

public class Program {

	public static int mySqrt(int num) {
		int	numSqrt = 1;

		while (numSqrt * numSqrt < num) { numSqrt++; }
		if (numSqrt * numSqrt > num) { numSqrt--; }
		return numSqrt;
	}

	public static boolean findPrimeStatus(int num) {
		boolean	primeStatus = true;
		int	numSqrt = mySqrt(num);
		int	i = 2;

		if (num <= 1) {
			primeStatus = false;
		}

		if (num % 2 == 0) {
			primeStatus = false;
		}

		while (primeStatus && ++i <= numSqrt) {
			if (num % i == 0) {
				primeStatus = false;
				break ;
			}
		}
		System.out.println(primeStatus + " " + (i - 1));
		return primeStatus;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int	num = in.nextInt();
		in.close();

		if (num <= 1) {
			System.err.println("IllegalArgument");
			System.exit(-1);
		}

		findPrimeStatus(num);
    }
}



