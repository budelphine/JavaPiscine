import java.util.Scanner;

public class Program {

	public static int myPow(int num, int pow) {
		if (pow == 0) {
			return 1;
		}

		for (int i = 1; i < pow; i++) { num *= num; }

		return num;
	}

	public static int findMinGrade(int grade) {
		int	minGrade = 10;

		for (int i = 0; i < 5; i++) {
			if (grade % 10 < minGrade) {
				minGrade = grade % 10;
			}
			grade /= 10;
		}

		return minGrade;
	}

	public static int getGrade() {
		Scanner in = new Scanner(System.in);
		int grade = 0;
		int	nextNum;

		while (grade / 10000 == 0) {
			nextNum = in.nextInt();
			if (nextNum == 42) {
				return -1;
			}
			grade = grade * 10 + nextNum;
		}

		return grade;
	}

	public static String getWeekName(int rightWeekNum) {
		Scanner in = new Scanner(System.in);
		String weekName = in.nextLine();

		return weekName;
	}

	public static void printGradeStats(long gradesOfWeek) {
		long	i = 1;
		long	printableGrade;

		while (gradesOfWeek % 10 != 0) {
			System.out.printf("Week %d ", i++);
			printableGrade = gradesOfWeek % 10;
			while (printableGrade-- > 0) { System.out.print("="); }
			System.out.println(">");
			gradesOfWeek = gradesOfWeek / 10;
		}
	}

	public static void main(String[] args) {
		int grade = 0;
		long gradesOfWeek = 0;
		String weekName;

		for (int i = 0; i < 18; i++) {
			weekName = getWeekName(i);
			if (weekName.equals("42")) {
				break ;
			}
			if (!(weekName.equals("Week " + (i + 1)))) {
				System.err.println("IllegalArgument");
				System.exit(-1);
			}
			grade = getGrade();
			if (grade == -1) {
				break ;
			}
			gradesOfWeek = findMinGrade(grade) * myPow(10, i) + gradesOfWeek;
		}
		printGradeStats(gradesOfWeek);
	}
}