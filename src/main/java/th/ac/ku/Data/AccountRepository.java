package th.ac.ku.Data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import th.ac.ku.Model.BankAccount;



@Repository
public interface AccountRepository extends JpaRepository<BankAccount, Integer> { // JBDC = class , JPA = interface extend


}


