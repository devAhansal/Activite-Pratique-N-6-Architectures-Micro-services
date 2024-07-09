package net.ahansal.customerservice.repository;

import net.ahansal.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;



/* @RepositoryRestResource // Web service générique */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
