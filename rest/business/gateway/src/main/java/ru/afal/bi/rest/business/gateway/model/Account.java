package ru.afal.bi.rest.business.gateway.model;

import java.math.BigDecimal;

public interface Account {
  String getNumber();

  BigDecimal getBalance();
}
