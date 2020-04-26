package ru.afal.bi.business.logic.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.afal.bi.business.gateway.model.Account;
import ru.afal.bi.business.gateway.repository.AccountRepository;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

  private final AccountRepository accountRepository;

  @Override
  public void saveAccount(Account account) {
    accountRepository.save(account);
  }
}
