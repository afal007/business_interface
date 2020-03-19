package ru.afal.business_interface.dal.dao;

import org.springframework.data.repository.CrudRepository;
import ru.afal.business_interface.dal.model.Account;

import java.util.Optional;

public interface AccountDao extends CrudRepository<Account, Long> {
  Optional<Account> findByNumber(String accountNumber);
}
