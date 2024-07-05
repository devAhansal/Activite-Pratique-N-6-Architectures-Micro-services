package ma.fsm.bankaccountservice.mappers;

import com.fasterxml.jackson.databind.util.BeanUtil;
import ma.fsm.bankaccountservice.dto.BankAccountResponseDTO;
import ma.fsm.bankaccountservice.entities.BankAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    public BankAccountResponseDTO fromBankAccount(BankAccount bankAccount){
        BankAccountResponseDTO bankAccountResponseDTO = new BankAccountResponseDTO();
        BeanUtils.copyProperties(bankAccount,bankAccountResponseDTO);
        return bankAccountResponseDTO;
    }
}
