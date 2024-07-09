package net.ahansal.accountservice.entities;


import jakarta.persistence.*;
import lombok.*;
import net.ahansal.accountservice.enums.AccountType;
import net.ahansal.accountservice.model.Customer;

import java.time.LocalDate;


@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor @Builder
public class BankAccount {
    @Id
    private String id;
    private LocalDate createdAT;
    private Double balance;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    @Transient //Champ non persistant dans la base données
    private Customer customer;
    private Long customerId;
}
