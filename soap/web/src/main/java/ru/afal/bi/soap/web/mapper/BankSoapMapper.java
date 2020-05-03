package ru.afal.bi.soap.web.mapper;

import bankws_schema.GetBankByBicResponse;
import org.mapstruct.Mapper;
import ru.afal.bi.soap.business.model.Bank;

@Mapper(componentModel = "spring")
public interface BankSoapMapper {
  GetBankByBicResponse map(Bank bank);
}
