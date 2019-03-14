package loan.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import loan.model.Collateral;
import loan.model.Loan;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Collateral defaultCollateral() {
		Collateral collateral = new Collateral("None", 0);
		return collateral;
	}
	
	@Bean
	public Loan emptyLoan() {
		Loan loan = new Loan("00000", 0, 0);
		return loan;
	}
	
	@Bean
	public Loan filledLoan() {
		Loan loan = new Loan("55555", 20, 180000);
		return loan;
	}

}
