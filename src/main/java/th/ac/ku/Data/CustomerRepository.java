package th.ac.ku.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.ku.Model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}

