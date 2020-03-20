package ru.afal.bi.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("ru.afal.bi.dal.model")
@SpringBootApplication(scanBasePackages = {"ru.afal.bi.web", "ru.afal.bi.configuration"})
@EnableJpaRepositories("ru.afal.bi.dal")
public class ConfigurationApplication {
  public static void main(String[] args) {
    SpringApplication.run(ConfigurationApplication.class, args);
  }
}

