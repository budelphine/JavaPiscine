public class Program {
    public static void main(String[] args) {
        User userFirst = new User();
        User userSecond = new User("John");
        User userThird = new User("Nina", 500);
        User userFourth = new User("Luck", 800);

        System.out.println(userFirst);
        System.out.println(userSecond);
        System.out.println(userThird);
        System.out.println(userFourth);
        System.out.println();

        System.out.println("Try some Incorrect param");
        System.out.println();

        userFirst = new User("Nina", -500);
        System.out.println(userFirst);
    }
}