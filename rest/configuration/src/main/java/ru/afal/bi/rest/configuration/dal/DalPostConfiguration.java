package ru.afal.bi.rest.configuration.dal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import ru.afal.bi.rest.business.gateway.repository.AccountRepository;
import ru.afal.bi.rest.dal.repository.AccountRepositoryPost;

@Configuration
@Profile("post")
public class DalPostConfiguration {
  @Bean
  public AccountRepository accountRepository() {
    return new AccountRepositoryPost();
  }
}
