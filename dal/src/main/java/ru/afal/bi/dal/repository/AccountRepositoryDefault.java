package ru.afal.bi.dal.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.afal.bi.business.gateway.model.Account;
import ru.afal.bi.business.gateway.repository.AccountRepository;
import ru.afal.bi.dal.dao.AccountDao;
import ru.afal.bi.dal.model.AccountEntity;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class AccountRepositoryDefault implements AccountRepository {

  private final AccountDao accountDao;

  @Override
  public Optional<? extends Account> getByNumber(String accountNumber) {
    return accountDao.findByNumber(accountNumber);
  }

  @Override
  public void save(Account account) {
    AccountEntity entity = new AccountEntity();
    entity.setNumber(account.getNumber());
    entity.setBalance(account.getBalance());

    try {
      accountDao.save(entity);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
