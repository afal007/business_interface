package ru.afal.bi.business.logic.service;

import ru.afal.bi.business.logic.model.AccountBalance;

public interface AccountBalanceService {
  AccountBalance getAccountBalance(String accountNumber);
}
