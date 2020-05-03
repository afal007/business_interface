package ru.afal.bi.rest.web.api;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class BankDTO {
  String bic;
  String name;
  String address;
  String swiftBic;
}
