package ru.afal.bi.rest.business.gateway.repository;

import ru.afal.bi.rest.business.gateway.model.Bank;

import java.util.Optional;

public interface BankRepository {
  Optional<? extends Bank> findByBic(String bic);
}
