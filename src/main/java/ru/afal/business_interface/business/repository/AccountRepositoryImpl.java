package ru.afal.business_interface.business.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.afal.business_interface.business.model.Account;
import ru.afal.business_interface.dal.dao.AccountDao;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class AccountRepositoryImpl implements AccountRepository {

  private final AccountDao accountDao;

  @Override
  public Optional<? extends Account> getByNumber(String accountNumber) {
    return accountDao.findByNumber(accountNumber);
  }
}
