package ru.afal.bi.business.logic.service;

import org.springframework.stereotype.Service;
import ru.afal.bi.business.logic.model.AccountBalance;

@Service
public interface AccountBalanceService {
  AccountBalance getAccountBalance(String accountNumber);
}
