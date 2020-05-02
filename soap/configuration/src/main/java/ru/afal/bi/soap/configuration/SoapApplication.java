package ru.afal.bi.soap.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "ru.afal.bi.soap.*")
public class SoapApplication {
  public static void main(String[] args) {
    SpringApplication.run(SoapApplication.class, args);
  }
}

