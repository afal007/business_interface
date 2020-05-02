package ru.afal.bi.rest.business.logic.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class AccountBalance {
  BigDecimal balance;
}
