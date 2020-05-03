package ru.afal.bi.rest.business.gateway.model;

public interface Bank {
  String getBic();

  String getName();

  String getAddress();

  String getSwiftBic();
}
