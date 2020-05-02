package ru.afal.bi.soap.business.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.afal.bi.soap.business.mapper.BankMapper;
import ru.afal.bi.soap.business.model.Bank;
import ru.afal.bi.soap.dal.dao.BankDAO;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class BankRepositoryImpl implements BankRepository {

  private final BankDAO bankDAO;
  private final BankMapper bankMapper;

  @Override
  public Optional<Bank> findByBic(String bic) {
    return bankDAO.findBankByBic(bic).map(bankMapper::map);
  }
}
