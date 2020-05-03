package ru.afal.bi.rest.dal.dao;

import lombok.RequiredArgsConstructor;
import ru.afal.bi.core.bankws.BankWSClient;
import ru.afal.bi.core.bankws.wsdl.GetBankByBicResponse;
import ru.afal.bi.rest.dal.model.BankEntity;

import java.util.Optional;

@RequiredArgsConstructor
public class BankWSDAO implements BankDAO {
  private final BankWSClient bankWSClient;

  @Override
  public Optional<BankEntity> findByBic(String bic) {
    return bankWSClient.getBankByBic(bic).map(this::getBankEntity);
  }

  private BankEntity getBankEntity(GetBankByBicResponse getBankByBicResponse) {
    BankEntity bankEntity = new BankEntity();
    bankEntity.setBic(getBankByBicResponse.getBic());
    bankEntity.setName(getBankByBicResponse.getName());
    bankEntity.setAddress(getBankByBicResponse.getAddress());
    bankEntity.setSwiftBic(getBankByBicResponse.getSwiftBic());
    return bankEntity;
  }
}
