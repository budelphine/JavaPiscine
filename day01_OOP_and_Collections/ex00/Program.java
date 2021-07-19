public class Program {
	public static void main(String[] args) {
		Transaction transactionFirst = new Transaction();

		User userFirst = new User();
		User userSecond = new User("John");
		User userThird = new User("Nina", 500);
		User userFourth = new User("Luck", 800, 1);

		System.out.println(userFirst);
		System.out.println(userSecond);
		System.out.println(userThird);
		System.out.println(userFourth);
		System.out.println();

		System.out.println(transactionFirst);
		System.out.println();

		System.out.println("Try some Incorrect param");

		userFirst = new User("Nina", -500);
		System.out.println(userFirst);
		System.out.println();

		transactionFirst = new Transaction(userThird, userFourth, "someCategory", 100);
		System.out.println(transactionFirst);
		System.out.println();

		transactionFirst = new Transaction(userThird, userFourth, "debit", -100);
		System.out.println(transactionFirst);
		System.out.println();

		transactionFirst = new Transaction(userThird, userFourth, "credit", 100);
		System.out.println(transactionFirst);
		System.out.println();

		transactionFirst = new Transaction(userThird, userFourth, "smth", -100);
		System.out.println(transactionFirst);
		System.out.println();
	}
}