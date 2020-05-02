package ru.afal.bi.rest.configuration.dal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.afal.bi.rest.business.gateway.repository.AccountRepository;
import ru.afal.bi.rest.dal.dao.AccountDao;
import ru.afal.bi.rest.dal.repository.AccountRepositoryDefault;

@Configuration
public class DalDefaultConfiguration {

  @Bean
  public AccountRepository accountRepository(AccountDao accountDao) {
    return new AccountRepositoryDefault(accountDao);
  }
}
