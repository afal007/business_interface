package ru.afal.bi.business.logic.service;

import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;
import ru.afal.bi.business.gateway.model.Account;
import ru.afal.bi.business.gateway.repository.AccountRepository;
import ru.afal.bi.business.logic.model.AccountBalance;
import ru.afal.bi.business.logic.properties.AccountBalanceProperties;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@EnableConfigurationProperties(AccountBalanceProperties.class)
public class AccountBalanceServiceImpl implements AccountBalanceService {

  private final AccountRepository accountRepository;
  private final AccountBalanceProperties accountBalanceProperties;

  @Override
  public AccountBalance getAccountBalanceFromProperties() {
    AccountBalance accountBalance = new AccountBalance();
    accountBalance.setBalance(accountBalanceProperties.getDefaultBalance());
    return accountBalance;
  }

  @Override
  public Optional<AccountBalance> getAccountBalance(String accountNumber) {
    return accountRepository.getByNumber(accountNumber).map(this::map);
  }

  @NotNull
  private AccountBalance map(Account account) {
    AccountBalance accountBalance = new AccountBalance();
    accountBalance.setBalance(account.getBalance());
    return accountBalance;
  }

}
