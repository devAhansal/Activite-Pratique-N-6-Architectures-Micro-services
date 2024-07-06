package ma.fsm.bankaccountservice;

import ma.fsm.bankaccountservice.entities.BankAccount;
import ma.fsm.bankaccountservice.entities.Customer;
import ma.fsm.bankaccountservice.enums.AccountType;
import ma.fsm.bankaccountservice.repositories.BankAccountRepository;
import ma.fsm.bankaccountservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class BankAccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankAccountServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner start(BankAccountRepository bankAccountRepository , CustomerRepository customerRepository) {
        return args -> {
            //create Customer
            Stream.of("SALAHEDDINE", "NOUREDDINE", "ZAKARIA").forEach(
                    c -> {
                        Customer customer = Customer.builder()
                                .name(c)
                                .build();
                        customerRepository.save(customer);
                    }
            );
            //create Accounts foreach Customer
            customerRepository.findAll().forEach(
                    customer -> {
                        for (int i = 0; i < 3; i++) {
                            BankAccount bankAccount = BankAccount.builder()
                                    .id(UUID.randomUUID().toString())
                                    .type(Math.random() > 0.5 ? AccountType.CURRENT_ACCOUNT : AccountType.SAVING_ACCOUNT)
                                    .balance(1000 + Math.random() * 90000)
                                    .createdAT(new Date())
                                    .currency("MAD")
                                    .customer(customer)
                                    .build();
                            bankAccountRepository.save(bankAccount);
                        }
                    }
            );
        };
    }
}
