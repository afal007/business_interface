package ru.afal.bi.soap.business.mapper;

import org.mapstruct.Mapper;
import ru.afal.bi.soap.business.model.Bank;
import ru.afal.bi.soap.dal.model.BankEntity;

@Mapper(componentModel = "spring")
public interface BankMapper {
  Bank map(BankEntity bankEntity);
}
