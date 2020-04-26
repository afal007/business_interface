package ru.afal.bi.web.api;

import lombok.Data;
import ru.afal.bi.business.gateway.model.Account;

import java.math.BigDecimal;

@Data
public class AccountDTO implements Account {
  private String number;
  private BigDecimal balance;
}
