package ru.afal.business_interface.front.api;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class AccountBalance {
  BigDecimal balance;
}
