package loan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import loan.controller.BeanConfiguration;
import loan.model.Collateral;
import loan.model.Loan;
import loan.repository.LoanRepository;

@SpringBootApplication
public class LoanInformationApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(LoanInformationApplication.class, args);
		
	}
	
	@Autowired
	LoanRepository loanRepository;
	
	@Override
	public void run(String... args) throws Exception{
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Loan emptyLoan = applicationContext.getBean("emptyLoan", Loan.class);
		loanRepository.save(emptyLoan);
		
		Loan filledLoan = applicationContext.getBean("filledLoan", Loan.class);
		Collateral collateral = new Collateral("Home", 150000);
		filledLoan.setCollateral(collateral);
		loanRepository.save(filledLoan);
		
		List<Loan> allLoans = loanRepository.findAll();
		for(Loan loan : allLoans) {
			System.out.println(loan);
		}
		
	}

}
