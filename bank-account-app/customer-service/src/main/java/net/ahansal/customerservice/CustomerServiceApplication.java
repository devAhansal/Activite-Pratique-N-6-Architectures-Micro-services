package net.ahansal.customerservice;

import net.ahansal.customerservice.config.GlobalConfig;
import net.ahansal.customerservice.entities.Customer;
import net.ahansal.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@EnableConfigurationProperties(GlobalConfig.class)
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository) {
        return args -> {
            List<Customer> customersList = List.of(
                    Customer.builder()
                            .firstName("SalahEddine")
                            .lastName("Ahansal")
                            .email("salaheddineahansal@gmail.com")
                            .build(),
                    Customer.builder()
                            .firstName("NourEddine")
                            .lastName("Ahansal")
                            .email("noureddin@gmail.com")
                            .build()
            );

            customerRepository.saveAll(customersList);
        };
    }
}
