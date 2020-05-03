package ru.afal.bi.soap.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = "ru.afal.bi.soap.*")
@EnableMongoRepositories("ru.afal.bi.soap.dal.dao")
public class SoapApplication {
  public static void main(String[] args) {
    SpringApplication.run(SoapApplication.class, args);
  }
}

