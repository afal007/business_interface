package ru.afal.bi.rest.dal.dao;

import ru.afal.bi.rest.dal.model.BankEntity;

import java.util.Optional;

public interface BankDAO {
  Optional<BankEntity> findByBic(String bic);
}
