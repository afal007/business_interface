package ru.afal.bi.rest.dal.model;

import lombok.Data;
import ru.afal.bi.rest.business.gateway.model.Bank;

@Data
public class BankEntity implements Bank {
  private String bic;
  private String name;
  private String address;
  private String swiftBic;
}
