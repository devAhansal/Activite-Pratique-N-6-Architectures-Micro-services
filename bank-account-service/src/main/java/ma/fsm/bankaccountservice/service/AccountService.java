package ma.fsm.bankaccountservice.service;

import ma.fsm.bankaccountservice.dto.BankAccountRequestDTO;
import ma.fsm.bankaccountservice.dto.BankAccountResponseDTO;

public interface AccountService {
     BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
     BankAccountResponseDTO updateAccount(String id,BankAccountRequestDTO bankAccountDTO);
}
