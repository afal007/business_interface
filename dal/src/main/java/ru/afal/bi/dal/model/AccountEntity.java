package ru.afal.bi.dal.model;

import lombok.Getter;
import ru.afal.bi.business.gateway.model.Account;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ACCOUNT")
@Getter
public class AccountEntity implements Account {
  @Id
  @GeneratedValue
  private long id;
  @Column
  private String number;
  @Column
  private BigDecimal balance;
}
