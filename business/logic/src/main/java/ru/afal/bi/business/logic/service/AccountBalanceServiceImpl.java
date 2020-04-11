package ru.afal.bi.business.logic.service;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;
import ru.afal.bi.business.gateway.model.Account;
import ru.afal.bi.business.gateway.repository.AccountRepository;
import ru.afal.bi.business.logic.model.AccountBalance;
import ru.afal.bi.business.logic.properties.AccountBalanceProperties;

@Service
@RequiredArgsConstructor
@EnableConfigurationProperties(AccountBalanceProperties.class)
public class AccountBalanceServiceImpl implements AccountBalanceService {

  private final AccountRepository accountRepository;
  private final AccountBalanceProperties accountBalanceProperties;

  @Override
  public AccountBalance getAccountBalance(String accountNumber) {
    AccountBalance accountBalance = new AccountBalance();
    accountBalance.setBalance(accountRepository.getByNumber(accountNumber).map(Account::getBalance).orElse(accountBalanceProperties.getDefaultBalance()));
    return accountBalance;
  }
}
