package ru.afal.bi.dal.model;

import lombok.Getter;
import lombok.Setter;
import ru.afal.bi.business.gateway.model.Account;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ACCOUNT")
@Getter
@Setter
public class AccountEntity implements Account {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column
  private String number;
  @Column
  private BigDecimal balance;
}
