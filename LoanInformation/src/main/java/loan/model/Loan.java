package loan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Loan {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String accountNumber;
	private int term;
	private double amount;
	
	@Autowired
	private Collateral collateral;
	
	public Loan() {
		super();
	}
	
	public Loan(String accountNumber, int term, double amount, Collateral collateral) {
		super();
		this.accountNumber = accountNumber;
		this.term = term;
		this.amount = amount;
		this.collateral = collateral;
	}

	public Loan(String accountNumber, int term, double amount) {
		super();
		this.accountNumber = accountNumber;
		this.term = term;
		this.amount = amount;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Collateral getCollateral() {
		return collateral;
	}

	public void setCollateral(Collateral collateral) {
		this.collateral = collateral;
	}

	@Override
	public String toString() {
		return "Loan [id=" + id + ", accountNumber=" + accountNumber + ", term=" + term + ", amount=" + amount
				+ ", collateral=" + collateral + "]";
	}
	
}
