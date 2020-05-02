package ru.afal.bi.soap.business.repository;

import ru.afal.bi.soap.business.model.Bank;

import java.util.Optional;

public interface BankRepository {
  Optional<Bank> findByBic(String bic);
}
