package ru.afal.bi.dal.repository;

import org.springframework.stereotype.Repository;
import ru.afal.bi.business.gateway.model.Account;
import ru.afal.bi.business.gateway.repository.AccountRepository;
import ru.afal.bi.dal.handler.AccountProcedureHandler;

import java.util.Optional;

@Repository
public class AccountRepositoryPost implements AccountRepository {

  @Override
  public Optional<? extends Account> getByNumber(String accountNumber) {
    return Optional.of(AccountProcedureHandler.INSTANCE);
  }

  @Override
  public void save(Account account) {

  }
}
