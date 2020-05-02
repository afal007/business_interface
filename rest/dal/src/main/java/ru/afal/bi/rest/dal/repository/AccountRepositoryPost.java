package ru.afal.bi.rest.dal.repository;

import org.springframework.stereotype.Repository;
import ru.afal.bi.rest.business.gateway.model.Account;
import ru.afal.bi.rest.business.gateway.repository.AccountRepository;
import ru.afal.bi.rest.dal.handler.AccountProcedureHandler;

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
