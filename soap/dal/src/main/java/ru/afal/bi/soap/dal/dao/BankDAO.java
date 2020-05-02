package ru.afal.bi.soap.dal.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.afal.bi.soap.dal.model.BankEntity;

import java.util.Optional;

public interface BankDAO extends MongoRepository<BankEntity, String> {
  Optional<BankEntity> findBankByBic(String bic);
}
