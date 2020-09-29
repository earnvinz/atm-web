package th.ac.ku.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import th.ac.ku.Model.BankAccount;
import th.ac.ku.service.BankAccountService;

import java.util.List;

@RestController
@RequestMapping("/api/bankaccount")
public class BankAccountRestController {
    private BankAccountService bankAccountService;

    public BankAccountRestController(BankAccountService bankAccountService) {
        this.bankAccountService = bankAccountService;
    }
    @GetMapping
    public List<BankAccount> getAll(){
        return bankAccountService.getBankAccounts();
    }
    @GetMapping("/{id}")
    public BankAccount getOne(@PathVariable int id){
        return bankAccountService.findCustomer(id);
    }
}
