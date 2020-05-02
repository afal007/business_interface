package ru.afal.bi.rest.business.logic.service;

import ru.afal.bi.rest.business.logic.model.AccountBalance;

import java.util.Optional;

public interface AccountBalanceService {
  AccountBalance getAccountBalanceFromProperties();

  Optional<AccountBalance> getAccountBalance(String accountNumber);
}
