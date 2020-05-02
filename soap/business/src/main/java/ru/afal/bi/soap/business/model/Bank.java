package ru.afal.bi.soap.business.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Bank {
  String id;
  String bic;
  String name;
  String address;
  String swiftBic;
}
