package ma.fsm.bankaccountservice.service;

import ma.fsm.bankaccountservice.dto.BankAccountRequestDTO;
import ma.fsm.bankaccountservice.dto.BankAccountResponseDTO;
import ma.fsm.bankaccountservice.entities.BankAccount;
import ma.fsm.bankaccountservice.enums.AccountType;
import ma.fsm.bankaccountservice.mappers.AccountMapper;
import ma.fsm.bankaccountservice.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

    @Autowired
    BankAccountRepository bankAccountRepository;
    @Autowired
    AccountMapper accountMapper;

    @Override
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO) {
        BankAccount bankAccount = BankAccount.builder()
                .id(UUID.randomUUID().toString())
                .type(bankAccountDTO.getType())
                .balance(bankAccountDTO.getBalance())
                .createdAT(new Date())
                .currency(bankAccountDTO.getCurrency())
                .build();
        BankAccount saveBankAccount = bankAccountRepository.save(bankAccount);
        //Ce code doit être dans la classe AccountMapper
      /*  BankAccountResponseDTO bankAccountResponseDTO = BankAccountResponseDTO.builder()
                .id(saveBankAccount.getId())
                .type(saveBankAccount.getType())
                .createdAT(saveBankAccount.getCreatedAT())
                .balance(saveBankAccount.getBalance())
                .currency(saveBankAccount.getCurrency())
                .build();*/
        BankAccountResponseDTO bankAccountResponseDTO = accountMapper.fromBankAccount(saveBankAccount);
        return bankAccountResponseDTO;
    }
}
