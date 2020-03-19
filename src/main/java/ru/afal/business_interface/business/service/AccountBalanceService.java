package ru.afal.business_interface.business.service;

import org.springframework.stereotype.Service;
import ru.afal.business_interface.front.api.AccountBalance;

@Service
public interface AccountBalanceService {
  AccountBalance getAccountBalance(String accountNumber);
}
