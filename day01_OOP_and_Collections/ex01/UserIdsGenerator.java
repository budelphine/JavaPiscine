public class UserIdsGenerator {
    public static       UserIdsGenerator userIdsGenerator;
    public static int   idCounter;

    private UserIdsGenerator() {
        idCounter = 0;
    }

    public static synchronized UserIdsGenerator getInstance( ) {
        if (userIdsGenerator == null)
            userIdsGenerator = new UserIdsGenerator();
        return userIdsGenerator;
    }

    public int generateId() {
        idCounter++;
        return idCounter;
    }
}
