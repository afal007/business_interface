package ru.afal.bi.soap.dal.model;

import lombok.Data;

@Data
public class BankEntity {
  private String id;

  private String bic;
  private String name;
  private String address;
  private String swiftBic;
}
