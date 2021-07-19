public class Program {
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

    public static void main(String[] args) {
        int num = 479598;

        System.out.println(sumOfDigits(num));
    }
}