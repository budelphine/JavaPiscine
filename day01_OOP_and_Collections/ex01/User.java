public class User {
    private String	name;
    private int		balance;
    private int		id;
    private UserIdsGenerator userIdsGenerator;

    {
        this.name = "Name";
        this.balance = 0;
        this.id = userIdsGenerator.getInstance().generateId();
    }

    public User() {

    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, int balance) {
        this.name = name;
        if (balance < 0) {
            System.out.println("Balance is less than ZERO. Please, set correct balance");
        } else {
            this.balance = balance;
        }
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        if (balance < 0) {
            System.out.println("Balance is less than ZERO. Please, set correct balance");
        } else {
            this.balance = balance;
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        String user;

        user = id + ", " + name + ", " + balance;
        return user;
    }

}