import java.util.UUID;

public class Transaction {
	private UUID	id;
	private User	sender;
	private User	recipient;
	private String	transferCategory;
	private int		transferAmount;

	{
		this.id = new UUID(1, 128);
		this.sender = new User("FROM");
		this.recipient = new User("TO");
		this.transferCategory = "NONE";
		this.transferAmount = 0;
	}

	public Transaction() { }

	public Transaction(User recipient) {
		this.recipient = recipient;
	}

	public Transaction(User recipient, User sender) {
		this.recipient = recipient;
		this.sender = sender;
	}

	public Transaction(User recipient, User sender, String transferCategory) {
		this.recipient = recipient;
		this.sender = sender;

		if (!transferCategory.equals("debit") || !transferCategory.equals("credit")) {
			System.out.println("Transfer Category can only be a debit or a credit. Please, set correct Transfer Category");
		} else {
			this.transferCategory = transferCategory;
		}
	}

	public Transaction(User recipient, User sender, String transferCategory, int transferAmount) {
		this.recipient = recipient;
		this.sender = sender;

		if (!(transferCategory.equals("debit") || transferCategory.equals("credit"))) {
			System.out.println("Transfer Category can only be a debit or a credit. Please, set correct Transfer Category");
		} else {
			this.transferCategory = transferCategory;
		}

		if (transferCategory.equals("debit") && transferAmount < 0 && !transferCategory.equals("none"))
			System.out.println("Transfer Amount can't be negative with '" + transferCategory
					+ "' Transfer Category. Please, set correct Transfer Category");
		else if (transferCategory.equals("credit") && transferAmount > 0 && !transferCategory.equals("none"))
			System.out.println("Transfer Amount can't be positive with '" + transferCategory
					+ "' Transfer Category. Please, set correct Transfer Category");
		else
			this.transferAmount = transferAmount;
	}

	public UUID getId() {
		return id;
	}

	public User getSender() {
		return sender;
	}

	public User getRecipient() {
		return recipient;
	}

	public String getTransferCategory() {
		return transferCategory;
	}

	public int getTransferAmount() {
		return transferAmount;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public void setRecipient(User recipient) {
		this.recipient = recipient;
	}

	public void setTransferCategory(String transferCategory) {
		if (transferCategory.equals("debit") && transferAmount < 0 && !transferCategory.equals("none"))
			System.out.println("Transfer Category can be only 'credit' with this Transfer Amount." +
					"Please, set correct Transfer Category");
		else if (transferCategory.equals("credit") && transferAmount > 0 && !transferCategory.equals("none"))
			System.out.println("Transfer Category can be only 'debit' with this Transfer Amount." +
					"Please, set correct Transfer Category");
		else
			this.transferCategory = transferCategory;
	}

	public void setTransferAmount(int transferAmount) {
		if (transferCategory.equals("debit") && transferAmount < 0 && !transferCategory.equals("none"))
			System.out.println("Transfer Amount can't be negative with '" + transferCategory
					+ "' Transfer Category. Please, set correct Transfer Category");
		else if (transferCategory.equals("credit") && transferAmount > 0 && !transferCategory.equals("none"))
			System.out.println("Transfer Amount can't be positive with '" + transferCategory
					+ "' Transfer Category. Please, set correct Transfer Category");
		else
			this.transferAmount = transferAmount;
	}

	@Override
	public String toString() {
		String transaction;

		transaction = sender.getName() + " -> " + recipient.getName() + ", "
				+ transferAmount + ", " + (transferAmount < 0 ? "OUTCOME" : "INCOME") + ", " + id.toString();
		return transaction;
	}
}