package th.ac.ku.service;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import th.ac.ku.Data.AccountRepository;
import th.ac.ku.Model.BankAccount;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class BankAccountService {
    private RestTemplate restTemplate;

    public BankAccountService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public List<BankAccount> getCustomerBankAccount(int customerId) {
        String url = "http://localhost:8091/api/bankaccount/customer/" +
                customerId;
        ResponseEntity<BankAccount[]> response =
                restTemplate.getForEntity(url, BankAccount[].class);

        BankAccount[] accounts = response.getBody();

        return Arrays.asList(accounts);
    }


//    public void CreateAccount(BankAccount bankAccount){
//        repository.save(bankAccount);
//    }
//    public BankAccount findCustomer(int id) {
//        try {
//            return repository.findById(id).get();
//        } catch (NoSuchElementException e) {
//            return null;
//        }
//
//
//
//
//    public List<BankAccount> getBankAccounts() {
//        return repository.findAll();
//    }
}
