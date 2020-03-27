package ru.afal.bi.dal.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.afal.bi.dal.model.AccountEntity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class AccountJdbcDao implements AccountDao {

  private final JdbcTemplate template;

  @Override
  public Optional<AccountEntity> findByNumber(String accountNumber) {
    return Optional.ofNullable(
      template.queryForObject(
        "SELECT id, number, balance FROM account WHERE number=?",
        this::map,
        accountNumber
      )
    );
  }

  @Override
  public <S extends AccountEntity> S save(S entity) {
    return null;
  }

  @Override
  public <S extends AccountEntity> Iterable<S> saveAll(Iterable<S> entities) {
    return null;
  }

  @Override
  public Optional<AccountEntity> findById(Long aLong) {
    return Optional.empty();
  }

  @Override
  public boolean existsById(Long aLong) {
    return false;
  }

  @Override
  public Iterable<AccountEntity> findAll() {
    return null;
  }

  @Override
  public Iterable<AccountEntity> findAllById(Iterable<Long> longs) {
    return null;
  }

  @Override
  public long count() {
    return 0;
  }

  @Override
  public void deleteById(Long aLong) {

  }

  @Override
  public void delete(AccountEntity entity) {

  }

  @Override
  public void deleteAll(Iterable<? extends AccountEntity> entities) {

  }

  @Override
  public void deleteAll() {

  }

  private AccountEntity map(ResultSet rs, int rowNum) throws SQLException {
    AccountEntity accountEntity = new AccountEntity();
    accountEntity.setId(rs.getLong("id"));
    accountEntity.setNumber(rs.getString("number"));
    accountEntity.setBalance(rs.getBigDecimal("balance"));
    return accountEntity;
  }
}
