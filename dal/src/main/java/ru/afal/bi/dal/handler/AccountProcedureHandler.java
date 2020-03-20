package ru.afal.bi.dal.handler;

import ru.afal.bi.business.gateway.model.Account;

import java.math.BigDecimal;

public enum AccountProcedureHandler implements Account {
  INSTANCE;

  @Override
  public BigDecimal getBalance() {
    return procedureToDB();
  }

  private BigDecimal procedureToDB() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException ignore) {
    }

    return BigDecimal.valueOf(Math.random());
  }
}
