package ru.afal.bi.dal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.afal.bi.dal.model.AccountEntity;

import java.util.Optional;

@Repository
public interface AccountDao extends CrudRepository<AccountEntity, Long> {
  Optional<AccountEntity> findByNumber(String accountNumber);
}
