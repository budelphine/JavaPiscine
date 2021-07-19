public class User {
	private String	name;
	private int		balance;
	private int		id;

	{
		this.name = "Name";
		this.balance = 0;
		this.id = 0;
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

	public User(String name, int balance, int id) {
		this.name = name;
		this.id = id;

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