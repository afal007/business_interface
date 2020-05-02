package ru.afal.bi.rest.business.logic.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.math.BigDecimal;

@Data
@ConfigurationProperties("balance")
public class AccountBalanceProperties {
  private BigDecimal defaultBalance;
}
