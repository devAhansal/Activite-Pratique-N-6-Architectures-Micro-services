package net.ahansal.accountservice.web;

import net.ahansal.accountservice.clients.CustomerRestClient;
import net.ahansal.accountservice.entities.BankAccount;
import net.ahansal.accountservice.model.Customer;
import net.ahansal.accountservice.repository.BankAccountRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountRestController {
    private BankAccountRepository bankAccountRepository;
    private CustomerRestClient customerRestClient;

    public AccountRestController(BankAccountRepository bankAccountRepository, CustomerRestClient customerRestClient) {
        this.bankAccountRepository = bankAccountRepository;
        this.customerRestClient = customerRestClient;
    }

    @GetMapping("/accounts")
    public List<BankAccount> bankAccounts() {
        List<BankAccount> listBankAccounts = bankAccountRepository.findAll();
        listBankAccounts.forEach(bankAccount -> {
            Customer customer =  customerRestClient.getCustomerById(bankAccount.getCustomerId());
            bankAccount.setCustomer(customer);
        });
        return listBankAccounts ;
    }

    @GetMapping("/accounts/{id}")
    public BankAccount bankAccounts(@PathVariable String id) {
        BankAccount bankAccount = bankAccountRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("Account %s not found", id)));
      Customer customer =  customerRestClient.getCustomerById(bankAccount.getCustomerId());
      bankAccount.setCustomer(customer);
      return  bankAccount;
    }
}
