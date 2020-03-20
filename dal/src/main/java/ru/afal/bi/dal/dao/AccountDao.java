package ru.afal.bi.dal.dao;

import org.springframework.data.repository.CrudRepository;
import ru.afal.bi.dal.model.AccountEntity;

import java.util.Optional;

public interface AccountDao extends CrudRepository<AccountEntity, Long> {
  Optional<AccountEntity> findByNumber(String accountNumber);
}
