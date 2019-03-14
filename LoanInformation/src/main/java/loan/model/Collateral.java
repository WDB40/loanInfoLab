package loan.model;

import javax.persistence.Embeddable;

@Embeddable
public class Collateral {
	
	private String type;
	private double worth;
	
	public Collateral() {
		super();
	}

	public Collateral(String type, double worth) {
		super();
		this.type = type;
		this.worth = worth;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getWorth() {
		return worth;
	}

	public void setWorth(double worth) {
		this.worth = worth;
	}

	@Override
	public String toString() {
		return "Collateral [type=" + type + ", worth=" + worth + "]";
	}

}
