package loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import loan.model.Loan;

public interface LoanRepository extends JpaRepository<Loan, Long>{

}
