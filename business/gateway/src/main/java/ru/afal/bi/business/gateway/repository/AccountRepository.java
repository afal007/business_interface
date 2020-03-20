package ru.afal.bi.business.gateway.repository;

import ru.afal.bi.business.gateway.model.Account;

import java.util.Optional;

public interface AccountRepository {
  Optional<? extends Account> getByNumber(String accountNumber);
}
