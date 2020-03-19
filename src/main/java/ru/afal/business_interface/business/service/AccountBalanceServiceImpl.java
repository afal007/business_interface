package ru.afal.business_interface.business.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.afal.business_interface.business.model.Account;
import ru.afal.business_interface.business.repository.AccountRepository;
import ru.afal.business_interface.front.api.AccountBalance;

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
