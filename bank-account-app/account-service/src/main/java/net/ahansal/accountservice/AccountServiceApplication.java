package net.ahansal.accountservice;

import net.ahansal.accountservice.clients.CustomerRestClient;
import net.ahansal.accountservice.entities.BankAccount;
import net.ahansal.accountservice.enums.AccountType;
import net.ahansal.accountservice.repository.BankAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.UUID;

@SpringBootApplication
@EnableFeignClients
public class AccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(BankAccountRepository bankAccountRepository , CustomerRestClient customerRestClient) {
        return args -> {
            customerRestClient.getAllCustomers().forEach(
                    customer -> {
                        BankAccount bankAccount1 = BankAccount.builder()
                                .id(UUID.randomUUID().toString())
                                .type(Math.random() > 0.5 ? AccountType.CURRENT_ACCOUNT : AccountType.SAVING_ACCOUNT)
                                .balance(1000 + Math.random() * 90000)
                                .createdAT(LocalDate.now())
                                .currency("MAD")
                                .customerId(customer.getId())
                                .build();
                        bankAccountRepository.save(bankAccount1);

                        BankAccount bankAccount2 = BankAccount.builder()
                                .id(UUID.randomUUID().toString())
                                .type(Math.random() > 0.5 ? AccountType.CURRENT_ACCOUNT : AccountType.SAVING_ACCOUNT)
                                .balance(1000 + Math.random() * 90000)
                                .createdAT(LocalDate.now())
                                .currency("MAD")
                                .customerId(customer.getId())
                                .build();
                        bankAccountRepository.save(bankAccount2);
                    }
            );

        };
    }
}
