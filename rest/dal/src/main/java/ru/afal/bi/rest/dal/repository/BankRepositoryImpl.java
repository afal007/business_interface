package ru.afal.bi.rest.dal.repository;

import lombok.RequiredArgsConstructor;
import ru.afal.bi.rest.business.gateway.model.Bank;
import ru.afal.bi.rest.business.gateway.repository.BankRepository;
import ru.afal.bi.rest.dal.dao.BankDAO;

import java.util.Optional;

@RequiredArgsConstructor
public class BankRepositoryImpl implements BankRepository {

  private final BankDAO bankDAO;

  @Override
  public Optional<? extends Bank> findByBic(String bic) {
    return bankDAO.findByBic(bic);
  }
}
