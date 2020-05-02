package ru.afal.bi.rest.business.gateway.repository;

import ru.afal.bi.rest.business.gateway.model.Account;

import java.util.Optional;

public interface AccountRepository {
  Optional<? extends Account> getByNumber(String accountNumber);

  void save(Account account);
}
