package ru.afal.bi.rest.dal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.afal.bi.rest.dal.model.AccountEntity;

import java.util.Optional;

@Repository
public interface AccountDAO extends CrudRepository<AccountEntity, Long> {
  Optional<AccountEntity> findByNumber(String accountNumber);
}
