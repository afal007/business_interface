package ru.afal.bi.business.logic.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.afal.bi.business.gateway.model.Account;
import ru.afal.bi.business.gateway.repository.AccountRepository;
import ru.afal.bi.business.logic.model.AccountBalance;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class AccountBalanceServiceImpl implements AccountBalanceService {

  private final AccountRepository accountRepository;

  @Override
  public AccountBalance getAccountBalance(String accountNumber) {
    AccountBalance accountBalance = new AccountBalance();
    accountBalance.setBalance(accountRepository.getByNumber(accountNumber).map(Account::getBalance).orElse(BigDecimal.ZERO));
    return accountBalance;
  }
}
