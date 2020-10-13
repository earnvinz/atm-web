package th.ac.ku.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.ku.Model.Customer;
import th.ac.ku.service.BankAccountService;
import th.ac.ku.Model.BankAccount;

import java.util.ArrayList;

@Controller
@RequestMapping("/customer")
public class BankAccountController {
    ArrayList<Customer> customers = new ArrayList<>();

    public BankAccountController(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    @RequestMapping("/customer")
    public String getCustomerPage(Model model) {
        ArrayList<String> customers = new ArrayList<>();
        customers.add("Peter");
        customers.add("Nancy");
        customers.add("Rick");
        model.addAttribute("allCustomers", customers);
        return "customer";
    }

    @GetMapping
    public String getCustomerPage(Model model) {
        model.addAttribute("allCustomers", customerService.getCustomers());
        return "customer";
    }

    @PostMapping("/customer")
    public String registerCustomer(@ModelAttribute Customer customer, Model model) {
        customers.add(customer);
        model.addAttribute("allCustomers", customers);
        return "redirect:customer";
    }



}
