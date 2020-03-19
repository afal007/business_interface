package ru.afal.business_interface.dal.model;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Getter
public class Account implements ru.afal.business_interface.business.model.Account {
  @Id
  @GeneratedValue
  private long id;
  @Column
  private String number;
  @Column
  private BigDecimal balance;
}
