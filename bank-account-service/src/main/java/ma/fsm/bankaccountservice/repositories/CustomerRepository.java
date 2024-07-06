package ma.fsm.bankaccountservice.repositories;

import ma.fsm.bankaccountservice.entities.BankAccount;
import ma.fsm.bankaccountservice.entities.Customer;
import ma.fsm.bankaccountservice.enums.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;


public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
